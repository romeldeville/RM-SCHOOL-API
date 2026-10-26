package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.full.InformationsEtablissementScolaireFullDTO;
import rm_school_api.entity.InformationsEtablissementScolaire;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.InformationsEtablissementScolaireMapper;
import rm_school_api.repository.InformationsEtablissementScolaireRepository;
import rm_school_api.service.InformationsEtablissementScolaireService;

@Service
@RequiredArgsConstructor
public class InformationsEtablissementScolaireServiceImpl extends AbstractServiceImpl<InformationsEtablissementScolaire, InformationsEtablissementScolaireBasicDTO, InformationsEtablissementScolaireFullDTO> implements InformationsEtablissementScolaireService {

    private final InformationsEtablissementScolaireRepository repository;
    private final InformationsEtablissementScolaireMapper mapper;

    @Override
    protected JpaRepository<InformationsEtablissementScolaire, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<InformationsEtablissementScolaire, InformationsEtablissementScolaireBasicDTO, InformationsEtablissementScolaireFullDTO> getMapper() {
        return mapper;
    }
}
