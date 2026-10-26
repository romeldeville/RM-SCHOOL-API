package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.full.AnneeScolaireFullDTO;
import rm_school_api.entity.AnneeScolaire;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.AnneeScolaireMapper;
import rm_school_api.repository.AnneeScolaireRepository;
import rm_school_api.service.AnneeScolaireService;

@Service
@RequiredArgsConstructor
public class AnneeScolaireServiceImpl extends AbstractServiceImpl<AnneeScolaire, AnneeScolaireBasicDTO, AnneeScolaireFullDTO> implements AnneeScolaireService {

    private final AnneeScolaireRepository repository;
    private final AnneeScolaireMapper mapper;

    @Override
    protected JpaRepository<AnneeScolaire, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<AnneeScolaire, AnneeScolaireBasicDTO, AnneeScolaireFullDTO> getMapper() {
        return mapper;
    }
}
