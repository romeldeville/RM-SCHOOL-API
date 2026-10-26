package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.PaiementBasicDTO;
import rm_school_api.dto.full.PaiementFullDTO;
import rm_school_api.entity.Paiement;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.PaiementMapper;
import rm_school_api.repository.PaiementRepository;
import rm_school_api.service.PaiementService;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl extends AbstractServiceImpl<Paiement, PaiementBasicDTO, PaiementFullDTO> implements PaiementService {

    private final PaiementRepository repository;
    private final PaiementMapper mapper;

    @Override
    protected JpaRepository<Paiement, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Paiement, PaiementBasicDTO, PaiementFullDTO> getMapper() {
        return mapper;
    }
}
