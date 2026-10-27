package rm_school_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rm_school_api.entity.CompteUtilisateur;

import java.util.Optional;

@Repository
public interface CompteUtilisateurRepository extends JpaRepository<CompteUtilisateur, Long> {
    Optional<CompteUtilisateur> findByLogin(String login);
    boolean existsByLogin(String login);
}
