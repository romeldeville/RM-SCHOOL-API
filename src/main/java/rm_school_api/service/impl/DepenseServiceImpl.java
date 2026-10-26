package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.DepenseBasicDTO;
import rm_school_api.dto.full.DepenseFullDTO;
import rm_school_api.entity.Depense;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.DepenseMapper;
import rm_school_api.repository.DepenseRepository;
import rm_school_api.service.DepenseService;

@Service
@RequiredArgsConstructor
public class DepenseServiceImpl extends AbstractServiceImpl<Depense, DepenseBasicDTO, DepenseFullDTO> implements DepenseService {

    private final DepenseRepository repository;
    private final DepenseMapper mapper;

    @Override
    protected JpaRepository<Depense, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Depense, DepenseBasicDTO, DepenseFullDTO> getMapper() {
        return mapper;
    }
}
