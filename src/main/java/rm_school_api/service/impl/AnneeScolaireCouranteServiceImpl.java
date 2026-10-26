package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.AnneeScolaireCouranteBasicDTO;
import rm_school_api.dto.full.AnneeScolaireCouranteFullDTO;
import rm_school_api.entity.AnneeScolaireCourante;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.AnneeScolaireCouranteMapper;
import rm_school_api.repository.AnneeScolaireCouranteRepository;
import rm_school_api.service.AnneeScolaireCouranteService;

@Service
@RequiredArgsConstructor
public class AnneeScolaireCouranteServiceImpl extends AbstractServiceImpl<AnneeScolaireCourante, AnneeScolaireCouranteBasicDTO, AnneeScolaireCouranteFullDTO> implements AnneeScolaireCouranteService {

    private final AnneeScolaireCouranteRepository repository;
    private final AnneeScolaireCouranteMapper mapper;

    @Override
    protected JpaRepository<AnneeScolaireCourante, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<AnneeScolaireCourante, AnneeScolaireCouranteBasicDTO, AnneeScolaireCouranteFullDTO> getMapper() {
        return mapper;
    }
}
