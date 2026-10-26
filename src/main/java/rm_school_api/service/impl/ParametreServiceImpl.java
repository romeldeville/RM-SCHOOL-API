package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.ParametreBasicDTO;
import rm_school_api.dto.full.ParametreFullDTO;
import rm_school_api.entity.Parametre;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.ParametreMapper;
import rm_school_api.repository.ParametreRepository;
import rm_school_api.service.ParametreService;

@Service
@RequiredArgsConstructor
public class ParametreServiceImpl extends AbstractServiceImpl<Parametre, ParametreBasicDTO, ParametreFullDTO> implements ParametreService {

    private final ParametreRepository repository;
    private final ParametreMapper mapper;

    @Override
    protected JpaRepository<Parametre, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Parametre, ParametreBasicDTO, ParametreFullDTO> getMapper() {
        return mapper;
    }
}
