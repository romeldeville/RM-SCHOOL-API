package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.NiveauBasicDTO;
import rm_school_api.dto.full.NiveauFullDTO;
import rm_school_api.entity.Niveau;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.NiveauMapper;
import rm_school_api.repository.NiveauRepository;
import rm_school_api.service.NiveauService;

@Service
@RequiredArgsConstructor
public class NiveauServiceImpl extends AbstractServiceImpl<Niveau, NiveauBasicDTO, NiveauFullDTO> implements NiveauService {

    private final NiveauRepository repository;
    private final NiveauMapper mapper;

    @Override
    protected JpaRepository<Niveau, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Niveau, NiveauBasicDTO, NiveauFullDTO> getMapper() {
        return mapper;
    }
}
