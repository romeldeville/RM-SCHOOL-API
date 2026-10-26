package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.TypeCreneauBasicDTO;
import rm_school_api.dto.full.TypeCreneauFullDTO;
import rm_school_api.entity.TypeCreneau;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.TypeCreneauMapper;
import rm_school_api.repository.TypeCreneauRepository;
import rm_school_api.service.TypeCreneauService;

@Service
@RequiredArgsConstructor
public class TypeCreneauServiceImpl extends AbstractServiceImpl<TypeCreneau, TypeCreneauBasicDTO, TypeCreneauFullDTO> implements TypeCreneauService {

    private final TypeCreneauRepository repository;
    private final TypeCreneauMapper mapper;

    @Override
    protected JpaRepository<TypeCreneau, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<TypeCreneau, TypeCreneauBasicDTO, TypeCreneauFullDTO> getMapper() {
        return mapper;
    }
}
