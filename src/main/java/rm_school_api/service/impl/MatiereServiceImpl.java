package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.MatiereBasicDTO;
import rm_school_api.dto.full.MatiereFullDTO;
import rm_school_api.entity.Matiere;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.MatiereMapper;
import rm_school_api.repository.MatiereRepository;
import rm_school_api.service.MatiereService;

@Service
@RequiredArgsConstructor
public class MatiereServiceImpl extends AbstractServiceImpl<Matiere, MatiereBasicDTO, MatiereFullDTO> implements MatiereService {

    private final MatiereRepository repository;
    private final MatiereMapper mapper;

    @Override
    protected JpaRepository<Matiere, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Matiere, MatiereBasicDTO, MatiereFullDTO> getMapper() {
        return mapper;
    }
}
