package rm_school_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rm_school_api.entity.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
}
