package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.CompteUtilisateurBasicDTO;
import rm_school_api.dto.full.CompteUtilisateurFullDTO;
import rm_school_api.entity.CompteUtilisateur;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.CompteUtilisateurMapper;
import rm_school_api.repository.CompteUtilisateurRepository;
import rm_school_api.service.CompteUtilisateurService;

@Service
@RequiredArgsConstructor
public class CompteUtilisateurServiceImpl extends AbstractServiceImpl<CompteUtilisateur, CompteUtilisateurBasicDTO, CompteUtilisateurFullDTO> implements CompteUtilisateurService {

    private final CompteUtilisateurRepository repository;
    private final CompteUtilisateurMapper mapper;

    @Override
    protected JpaRepository<CompteUtilisateur, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<CompteUtilisateur, CompteUtilisateurBasicDTO, CompteUtilisateurFullDTO> getMapper() {
        return mapper;
    }
}
