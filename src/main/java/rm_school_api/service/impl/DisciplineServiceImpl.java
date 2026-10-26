package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.DisciplineBasicDTO;
import rm_school_api.dto.full.DisciplineFullDTO;
import rm_school_api.entity.Discipline;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.DisciplineMapper;
import rm_school_api.repository.DisciplineRepository;
import rm_school_api.service.DisciplineService;

@Service
@RequiredArgsConstructor
public class DisciplineServiceImpl extends AbstractServiceImpl<Discipline, DisciplineBasicDTO, DisciplineFullDTO> implements DisciplineService {

    private final DisciplineRepository repository;
    private final DisciplineMapper mapper;

    @Override
    protected JpaRepository<Discipline, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Discipline, DisciplineBasicDTO, DisciplineFullDTO> getMapper() {
        return mapper;
    }
}
