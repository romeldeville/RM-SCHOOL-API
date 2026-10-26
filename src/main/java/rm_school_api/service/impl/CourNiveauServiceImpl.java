package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.CourNiveauBasicDTO;
import rm_school_api.dto.full.CourNiveauFullDTO;
import rm_school_api.entity.CourNiveau;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.CourNiveauMapper;
import rm_school_api.repository.CourNiveauRepository;
import rm_school_api.service.CourNiveauService;

@Service
@RequiredArgsConstructor
public class CourNiveauServiceImpl extends AbstractServiceImpl<CourNiveau, CourNiveauBasicDTO, CourNiveauFullDTO> implements CourNiveauService {

    private final CourNiveauRepository repository;
    private final CourNiveauMapper mapper;

    @Override
    protected JpaRepository<CourNiveau, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<CourNiveau, CourNiveauBasicDTO, CourNiveauFullDTO> getMapper() {
        return mapper;
    }
}
