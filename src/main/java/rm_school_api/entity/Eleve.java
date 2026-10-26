package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "ELEVE")
@AttributeOverride(name = "id", column = @Column(name = "ID_ELEVE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Eleve extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 100, message = "le nom ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @NotBlank(message = "le prénom ne doit pas être vide")
    @Size(max = 100, message = "le prénom ne doit pas dépasser 100 caractères")
    @Column(name = "PRENOM", nullable = false, length = 100)
    private String prenom;

    @Past(message = "la date de naissance doit être dans le passé")
    @Column(name = "DATE_NAISSANCE")
    private LocalDate dateNaissance;

    @Size(max = 150, message = "le lieu de naissance ne doit pas dépasser 150 caractères")
    @Column(name = "LIEU_NAISSANCE", length = 150)
    private String lieuNaissance;

    @Size(max = 20, message = "le sexe ne doit pas dépasser 20 caractères")
    @Column(name = "SEXE", length = 20)
    private String sexe;

    @Size(max = 100, message = "le nom du père ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_PERE", length = 100)
    private String nomPere;

    @Size(max = 100, message = "le nom de la mère ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_MERE", length = 100)
    private String nomMere;

    @Size(max = 100, message = "le nom du tuteur ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_TUTEUR", length = 100)
    private String nomTuteur;

    @Size(max = 100, message = "les contacts des parents ne doivent pas dépasser 100 caractères")
    @Column(name = "CONTACTS_PARENTS", length = 100)
    private String contactsParents;

    @NotNull(message = "le compte utilisateur est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_COMPTE_UTILISATEUR", nullable = false)
    private CompteUtilisateur compteUtilisateur;
}
