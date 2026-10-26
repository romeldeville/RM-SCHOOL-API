package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.EtablissementScolaireBasicDTO;
import rm_school_api.dto.full.EtablissementScolaireFullDTO;
import rm_school_api.entity.EtablissementScolaire;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.EtablissementScolaireMapper;
import rm_school_api.repository.EtablissementScolaireRepository;
import rm_school_api.service.EtablissementScolaireService;

@Service
@RequiredArgsConstructor
public class EtablissementScolaireServiceImpl extends AbstractServiceImpl<EtablissementScolaire, EtablissementScolaireBasicDTO, EtablissementScolaireFullDTO> implements EtablissementScolaireService {

    private final EtablissementScolaireRepository repository;
    private final EtablissementScolaireMapper mapper;

    @Override
    protected JpaRepository<EtablissementScolaire, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<EtablissementScolaire, EtablissementScolaireBasicDTO, EtablissementScolaireFullDTO> getMapper() {
        return mapper;
    }
}
