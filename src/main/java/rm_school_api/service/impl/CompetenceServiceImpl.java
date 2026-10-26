package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.CompetenceBasicDTO;
import rm_school_api.dto.full.CompetenceFullDTO;
import rm_school_api.entity.Competence;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.CompetenceMapper;
import rm_school_api.repository.CompetenceRepository;
import rm_school_api.service.CompetenceService;

@Service
@RequiredArgsConstructor
public class CompetenceServiceImpl extends AbstractServiceImpl<Competence, CompetenceBasicDTO, CompetenceFullDTO> implements CompetenceService {

    private final CompetenceRepository repository;
    private final CompetenceMapper mapper;

    @Override
    protected JpaRepository<Competence, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Competence, CompetenceBasicDTO, CompetenceFullDTO> getMapper() {
        return mapper;
    }
}
