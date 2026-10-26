package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.CoursEnseignantBasicDTO;
import rm_school_api.dto.full.CoursEnseignantFullDTO;
import rm_school_api.entity.CoursEnseignant;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.CoursEnseignantMapper;
import rm_school_api.repository.CoursEnseignantRepository;
import rm_school_api.service.CoursEnseignantService;

@Service
@RequiredArgsConstructor
public class CoursEnseignantServiceImpl extends AbstractServiceImpl<CoursEnseignant, CoursEnseignantBasicDTO, CoursEnseignantFullDTO> implements CoursEnseignantService {

    private final CoursEnseignantRepository repository;
    private final CoursEnseignantMapper mapper;

    @Override
    protected JpaRepository<CoursEnseignant, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<CoursEnseignant, CoursEnseignantBasicDTO, CoursEnseignantFullDTO> getMapper() {
        return mapper;
    }
}
