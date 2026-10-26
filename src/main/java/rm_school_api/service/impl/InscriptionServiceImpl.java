package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.full.InscriptionFullDTO;
import rm_school_api.entity.Inscription;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.InscriptionMapper;
import rm_school_api.repository.InscriptionRepository;
import rm_school_api.service.InscriptionService;

@Service
@RequiredArgsConstructor
public class InscriptionServiceImpl extends AbstractServiceImpl<Inscription, InscriptionBasicDTO, InscriptionFullDTO> implements InscriptionService {

    private final InscriptionRepository repository;
    private final InscriptionMapper mapper;

    @Override
    protected JpaRepository<Inscription, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Inscription, InscriptionBasicDTO, InscriptionFullDTO> getMapper() {
        return mapper;
    }
}
