package rm_school_api.config.data;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import rm_school_api.entity.CompteUtilisateur;
import rm_school_api.entity.Personnel;
import rm_school_api.entity.Privilege;
import rm_school_api.entity.Role;
import rm_school_api.entity.StatutCompteUtilisateur;
import rm_school_api.repository.CompteUtilisateurRepository;
import rm_school_api.repository.PersonnelRepository;
import rm_school_api.repository.PrivilegeRepository;
import rm_school_api.repository.RoleRepository;
import rm_school_api.repository.StatutCompteUtilisateurRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Slf4j
@Component
@Order(1)
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final RoleRepository roleRepository;
    private final PrivilegeRepository privilegeRepository;
    private final StatutCompteUtilisateurRepository statutCompteUtilisateurRepository;
    private final CompteUtilisateurRepository compteUtilisateurRepository;
    private final PersonnelRepository personnelRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.info("=== Initialisation des données de base ===");

        // 1) Privilèges
        Privilege privAll = createPrivilegeIfNotExists("ALL", "Tous les privilèges", "ALL_PRIVILEGES", "All privileges");
        Privilege privGestion = createPrivilegeIfNotExists("GESTION", "Gestion générale", "MANAGEMENT", "General management");
        Privilege privConsultation = createPrivilegeIfNotExists("CONSULTATION", "Consultation", "CONSULTATION", "Consultation");

        Set<Privilege> allPrivileges = new HashSet<>(List.of(privAll, privGestion, privConsultation));
        Set<Privilege> gestionPrivileges = new HashSet<>(List.of(privGestion, privConsultation));
        Set<Privilege> consultPrivileges = new HashSet<>(List.of(privConsultation));

        // 2) Statuts compte utilisateur
        StatutCompteUtilisateur statutActif = createStatutIfNotExists("ACTIF", "Actif", "ACTIVE", "Active");
        createStatutIfNotExists("INACTIF", "Inactif", "INACTIVE", "Inactive");
        createStatutIfNotExists("BLOQUE", "Bloqué", "BLOCKED", "Blocked");

        // 3) Rôles
        Role roleAdministrateur = createRoleIfNotExists("ADMINISTRATEUR", "ADMINISTRATOR", "Administrateur de l application", "Application Administrator", allPrivileges);
        Role roleProviseur = createRoleIfNotExists("PROVISEUR", "PRINCIPAL", "Proviseur de l établissement", "School Principal", allPrivileges);
        Role roleDirecteur = createRoleIfNotExists("DIRECTEUR", "DIRECTOR", "Directeur de l établissement", "School Director", gestionPrivileges);
        Role roleCenseur = createRoleIfNotExists("CENSEUR", "DEAN_OF_STUDIES", "Censeur en charge de la pédagogie", "Dean of Studies", gestionPrivileges);
        Role roleSurveillantGeneral = createRoleIfNotExists("SURVEILLANT_GENERAL", "HEAD_OF_DISCIPLINE", "Surveillant Général", "Head of Discipline", gestionPrivileges);
        Role roleEnseignant = createRoleIfNotExists("ENSEIGNANT", "TEACHER", "Enseignant", "Teacher", consultPrivileges);
        Role roleEleve = createRoleIfNotExists("ELEVE", "STUDENT", "Elève", "Student", consultPrivileges);
        Role roleParent = createRoleIfNotExists("PARENT", "PARENT", "Parent d élève", "Parent/Guardian", consultPrivileges);
        Role roleSecretaire = createRoleIfNotExists("SECRETAIRE", "SECRETARY", "Secrétaire de l établissement", "School Secretary", gestionPrivileges);
        Role roleChefDeTravaux = createRoleIfNotExists("CHEF_DE_TRAVAUX", "WORKS_SUPERVISOR", "Chef de Travaux", "Works Supervisor", gestionPrivileges);

        // 4) Comptes utilisateurs + personnels cohérents
        createCompteAvecPersonnel("administrateur", "Admin@123", roleAdministrateur, statutActif, "Administrateur", "Système", "ADMIN");
        createCompteAvecPersonnel("proviseur", "Proviseur@123", roleProviseur, statutActif, "Proviseur", "Principal", "PROV");
        createCompteAvecPersonnel("directeur", "Directeur@123", roleDirecteur, statutActif, "Directeur", "Pédagogique", "DIR");
        createCompteAvecPersonnel("censeur", "Censeur@123", roleCenseur, statutActif, "Censeur", "Etudes", "CEN");
        createCompteAvecPersonnel("surveillant.general", "Surveillant@123", roleSurveillantGeneral, statutActif, "Surveillant", "Général", "SG");
        createCompteAvecPersonnel("enseignant", "Enseignant@123", roleEnseignant, statutActif, "Enseignant", "Test", "ENS");
        createCompteAvecPersonnel("secretaire", "Secretaire@123", roleSecretaire, statutActif, "Secrétaire", "Bureau", "SEC");
        createCompteAvecPersonnel("chef.travaux", "ChefTravaux@123", roleChefDeTravaux, statutActif, "Chef", "Travaux", "CT");

        // Comptes sans personnel obligatoire
        createCompteSeul("eleve", "Eleve@123", roleEleve, statutActif);
        createCompteSeul("parent", "Parent@123", roleParent, statutActif);

        log.info("=== Initialisation terminée : {} rôles / {} comptes utilisateurs ===", roleRepository.count(), compteUtilisateurRepository.count());
    }

    private Privilege createPrivilegeIfNotExists(String nom, String description, String nomAnglais, String descriptionAnglais) {
        return privilegeRepository.findAll().stream()
                .filter(p -> nom.equalsIgnoreCase(p.getNom()))
                .findFirst()
                .orElseGet(() -> {
                    Privilege p = new Privilege();
                    p.setNom(nom);
                    p.setDescription(description);
                    p.setNomAnglais(nomAnglais);
                    p.setDescriptionAnglais(descriptionAnglais);
                    Privilege saved = privilegeRepository.save(p);
                    log.info("Création privilège: {}", saved.getNom());
                    return saved;
                });
    }

    private StatutCompteUtilisateur createStatutIfNotExists(String nom, String description, String nomAnglais, String descriptionAnglais) {
        return statutCompteUtilisateurRepository.findAll().stream()
                .filter(s -> nom.equalsIgnoreCase(s.getNom()))
                .findFirst()
                .orElseGet(() -> {
                    StatutCompteUtilisateur s = new StatutCompteUtilisateur();
                    s.setNom(nom);
                    s.setDescription(description);
                    s.setNomAnglais(nomAnglais);
                    s.setDescriptionAnglais(descriptionAnglais);
                    StatutCompteUtilisateur saved = statutCompteUtilisateurRepository.save(s);
                    log.info("Création statut: {}", saved.getNom());
                    return saved;
                });
    }

    private Role createRoleIfNotExists(String nom, String nomAnglais, String description, String descriptionAnglais, Set<Privilege> privileges) {
        return roleRepository.findAll().stream()
                .filter(r -> nom.equalsIgnoreCase(r.getNom()))
                .findFirst()
                .orElseGet(() -> {
                    Role r = new Role();
                    r.setNom("ROLE_" + nom);
                    r.setNomAnglais("ROLE_" + nomAnglais);
                    r.setDescription(description);
                    r.setDescriptionAnglais(descriptionAnglais);
                    r.setPrivileges(privileges);
                    Role saved = roleRepository.save(r);
                    log.info("Création rôle: {}", saved.getNom());
                    return saved;
                });
    }

    private void createCompteAvecPersonnel(String login, String rawPassword, Role role, StatutCompteUtilisateur statut, String nom, String prenom, String matricule) {
        if (compteUtilisateurRepository.findByLogin(login).isPresent()) {
            log.info("Compte existant ignoré: {}", login);
            return;
        }

        CompteUtilisateur compte = new CompteUtilisateur();
        compte.setLogin(login);
        compte.setMotPasse(passwordEncoder.encode(rawPassword));
        compte.setRole(role);
        compte.setStatutCompteUtilisateur(statut);
        compteUtilisateurRepository.save(compte);

        Personnel personnel = personnelRepository.findAll().stream()
                .filter(p -> nom.equals(p.getNom()) && prenom.equals(p.getPrenom()))
                .findFirst()
                .orElseGet(() -> {
                    Personnel p = new Personnel();
                    p.setNom(nom);
                    p.setPrenom(prenom);
                    p.setContacts("000000000");
                    p.setCompteUtilisateur(compte);
                    Personnel saved = personnelRepository.save(p);
                    log.info("Création personnel: {} {}", saved.getNom(), saved.getPrenom());
                    return saved;
                });

        personnel.setCompteUtilisateur(compte);
        personnelRepository.save(personnel);
        log.info("Création compte: {} / {} (rôle {})", login, rawPassword, role.getNom());
    }

    private void createCompteSeul(String login, String rawPassword, Role role, StatutCompteUtilisateur statut) {
        if (compteUtilisateurRepository.findByLogin(login).isPresent()) {
            log.info("Compte existant ignoré: {}", login);
            return;
        }
        CompteUtilisateur compte = new CompteUtilisateur();
        compte.setLogin(login);
        compte.setMotPasse(passwordEncoder.encode(rawPassword));
        compte.setRole(role);
        compte.setStatutCompteUtilisateur(statut);
        compteUtilisateurRepository.save(compte);
        log.info("Création compte: {} / {} (rôle {})", login, rawPassword, role.getNom());
    }
}
