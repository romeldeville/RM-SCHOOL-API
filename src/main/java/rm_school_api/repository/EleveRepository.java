package rm_school_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rm_school_api.entity.Eleve;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {
}
