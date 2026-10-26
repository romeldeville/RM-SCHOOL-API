package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.FraisBasicDTO;
import rm_school_api.dto.full.FraisFullDTO;
import rm_school_api.entity.Frais;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.FraisMapper;
import rm_school_api.repository.FraisRepository;
import rm_school_api.service.FraisService;

@Service
@RequiredArgsConstructor
public class FraisServiceImpl extends AbstractServiceImpl<Frais, FraisBasicDTO, FraisFullDTO> implements FraisService {

    private final FraisRepository repository;
    private final FraisMapper mapper;

    @Override
    protected JpaRepository<Frais, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Frais, FraisBasicDTO, FraisFullDTO> getMapper() {
        return mapper;
    }
}
