package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.PensionBasicDTO;
import rm_school_api.dto.full.PensionFullDTO;
import rm_school_api.entity.Pension;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.PensionMapper;
import rm_school_api.repository.PensionRepository;
import rm_school_api.service.PensionService;

@Service
@RequiredArgsConstructor
public class PensionServiceImpl extends AbstractServiceImpl<Pension, PensionBasicDTO, PensionFullDTO> implements PensionService {

    private final PensionRepository repository;
    private final PensionMapper mapper;

    @Override
    protected JpaRepository<Pension, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Pension, PensionBasicDTO, PensionFullDTO> getMapper() {
        return mapper;
    }
}
