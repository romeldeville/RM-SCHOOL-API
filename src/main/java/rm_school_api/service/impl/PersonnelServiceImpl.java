package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.PersonnelBasicDTO;
import rm_school_api.dto.full.PersonnelFullDTO;
import rm_school_api.entity.Personnel;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.PersonnelMapper;
import rm_school_api.repository.PersonnelRepository;
import rm_school_api.service.PersonnelService;

@Service
@RequiredArgsConstructor
public class PersonnelServiceImpl extends AbstractServiceImpl<Personnel, PersonnelBasicDTO, PersonnelFullDTO> implements PersonnelService {

    private final PersonnelRepository repository;
    private final PersonnelMapper mapper;

    @Override
    protected JpaRepository<Personnel, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Personnel, PersonnelBasicDTO, PersonnelFullDTO> getMapper() {
        return mapper;
    }
}
