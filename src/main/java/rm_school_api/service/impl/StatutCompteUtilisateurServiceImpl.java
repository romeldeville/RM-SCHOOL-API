package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.StatutCompteUtilisateurBasicDTO;
import rm_school_api.dto.full.StatutCompteUtilisateurFullDTO;
import rm_school_api.entity.StatutCompteUtilisateur;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.StatutCompteUtilisateurMapper;
import rm_school_api.repository.StatutCompteUtilisateurRepository;
import rm_school_api.service.StatutCompteUtilisateurService;

@Service
@RequiredArgsConstructor
public class StatutCompteUtilisateurServiceImpl extends AbstractServiceImpl<StatutCompteUtilisateur, StatutCompteUtilisateurBasicDTO, StatutCompteUtilisateurFullDTO> implements StatutCompteUtilisateurService {

    private final StatutCompteUtilisateurRepository repository;
    private final StatutCompteUtilisateurMapper mapper;

    @Override
    protected JpaRepository<StatutCompteUtilisateur, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<StatutCompteUtilisateur, StatutCompteUtilisateurBasicDTO, StatutCompteUtilisateurFullDTO> getMapper() {
        return mapper;
    }
}
