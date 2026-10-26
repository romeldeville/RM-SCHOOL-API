package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.LigneEmploiDuTempsBasicDTO;
import rm_school_api.dto.full.LigneEmploiDuTempsFullDTO;
import rm_school_api.entity.LigneEmploiDuTemps;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.LigneEmploiDuTempsMapper;
import rm_school_api.repository.LigneEmploiDuTempsRepository;
import rm_school_api.service.LigneEmploiDuTempsService;

@Service
@RequiredArgsConstructor
public class LigneEmploiDuTempsServiceImpl extends AbstractServiceImpl<LigneEmploiDuTemps, LigneEmploiDuTempsBasicDTO, LigneEmploiDuTempsFullDTO> implements LigneEmploiDuTempsService {

    private final LigneEmploiDuTempsRepository repository;
    private final LigneEmploiDuTempsMapper mapper;

    @Override
    protected JpaRepository<LigneEmploiDuTemps, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<LigneEmploiDuTemps, LigneEmploiDuTempsBasicDTO, LigneEmploiDuTempsFullDTO> getMapper() {
        return mapper;
    }
}
