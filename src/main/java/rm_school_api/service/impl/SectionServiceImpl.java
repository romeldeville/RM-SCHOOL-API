package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.SectionBasicDTO;
import rm_school_api.dto.full.SectionFullDTO;
import rm_school_api.entity.Section;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.SectionMapper;
import rm_school_api.repository.SectionRepository;
import rm_school_api.service.SectionService;

@Service
@RequiredArgsConstructor
public class SectionServiceImpl extends AbstractServiceImpl<Section, SectionBasicDTO, SectionFullDTO> implements SectionService {

    private final SectionRepository repository;
    private final SectionMapper mapper;

    @Override
    protected JpaRepository<Section, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Section, SectionBasicDTO, SectionFullDTO> getMapper() {
        return mapper;
    }
}
