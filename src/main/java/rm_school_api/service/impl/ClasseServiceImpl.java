package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.ClasseBasicDTO;
import rm_school_api.dto.full.ClasseFullDTO;
import rm_school_api.entity.Classe;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.ClasseMapper;
import rm_school_api.repository.ClasseRepository;
import rm_school_api.service.ClasseService;

@Service
@RequiredArgsConstructor
public class ClasseServiceImpl extends AbstractServiceImpl<Classe, ClasseBasicDTO, ClasseFullDTO> implements ClasseService {

    private final ClasseRepository repository;
    private final ClasseMapper mapper;

    @Override
    protected JpaRepository<Classe, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Classe, ClasseBasicDTO, ClasseFullDTO> getMapper() {
        return mapper;
    }
}
