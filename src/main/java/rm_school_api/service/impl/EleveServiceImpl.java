package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.EleveBasicDTO;
import rm_school_api.dto.full.EleveFullDTO;
import rm_school_api.entity.Eleve;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.EleveMapper;
import rm_school_api.repository.EleveRepository;
import rm_school_api.service.EleveService;

@Service
@RequiredArgsConstructor
public class EleveServiceImpl extends AbstractServiceImpl<Eleve, EleveBasicDTO, EleveFullDTO> implements EleveService {

    private final EleveRepository repository;
    private final EleveMapper mapper;

    @Override
    protected JpaRepository<Eleve, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Eleve, EleveBasicDTO, EleveFullDTO> getMapper() {
        return mapper;
    }
}
