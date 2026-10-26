package rm_school_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rm_school_api.entity.CreneauHoraire;

@Repository
public interface CreneauHoraireRepository extends JpaRepository<CreneauHoraire, Long> {
}
