package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.CycleBasicDTO;
import rm_school_api.dto.full.CycleFullDTO;
import rm_school_api.entity.Cycle;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.CycleMapper;
import rm_school_api.repository.CycleRepository;
import rm_school_api.service.CycleService;

@Service
@RequiredArgsConstructor
public class CycleServiceImpl extends AbstractServiceImpl<Cycle, CycleBasicDTO, CycleFullDTO> implements CycleService {

    private final CycleRepository repository;
    private final CycleMapper mapper;

    @Override
    protected JpaRepository<Cycle, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Cycle, CycleBasicDTO, CycleFullDTO> getMapper() {
        return mapper;
    }
}
