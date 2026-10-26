package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.ExamenBasicDTO;
import rm_school_api.dto.full.ExamenFullDTO;
import rm_school_api.entity.Examen;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.ExamenMapper;
import rm_school_api.repository.ExamenRepository;
import rm_school_api.service.ExamenService;

@Service
@RequiredArgsConstructor
public class ExamenServiceImpl extends AbstractServiceImpl<Examen, ExamenBasicDTO, ExamenFullDTO> implements ExamenService {

    private final ExamenRepository repository;
    private final ExamenMapper mapper;

    @Override
    protected JpaRepository<Examen, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Examen, ExamenBasicDTO, ExamenFullDTO> getMapper() {
        return mapper;
    }
}
