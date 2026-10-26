package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;
import rm_school_api.dto.full.InformationsPersonnelFullDTO;
import rm_school_api.entity.InformationsPersonnel;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.InformationsPersonnelMapper;
import rm_school_api.repository.InformationsPersonnelRepository;
import rm_school_api.service.InformationsPersonnelService;

@Service
@RequiredArgsConstructor
public class InformationsPersonnelServiceImpl extends AbstractServiceImpl<InformationsPersonnel, InformationsPersonnelBasicDTO, InformationsPersonnelFullDTO> implements InformationsPersonnelService {

    private final InformationsPersonnelRepository repository;
    private final InformationsPersonnelMapper mapper;

    @Override
    protected JpaRepository<InformationsPersonnel, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<InformationsPersonnel, InformationsPersonnelBasicDTO, InformationsPersonnelFullDTO> getMapper() {
        return mapper;
    }
}
