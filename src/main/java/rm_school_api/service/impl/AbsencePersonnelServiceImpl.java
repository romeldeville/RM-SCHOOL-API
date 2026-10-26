package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.AbsencePersonnelBasicDTO;
import rm_school_api.dto.full.AbsencePersonnelFullDTO;
import rm_school_api.entity.AbsencePersonnel;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.AbsencePersonnelMapper;
import rm_school_api.repository.AbsencePersonnelRepository;
import rm_school_api.service.AbsencePersonnelService;

@Service
@RequiredArgsConstructor
public class AbsencePersonnelServiceImpl extends AbstractServiceImpl<AbsencePersonnel, AbsencePersonnelBasicDTO, AbsencePersonnelFullDTO> implements AbsencePersonnelService {

    private final AbsencePersonnelRepository repository;
    private final AbsencePersonnelMapper mapper;

    @Override
    protected JpaRepository<AbsencePersonnel, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<AbsencePersonnel, AbsencePersonnelBasicDTO, AbsencePersonnelFullDTO> getMapper() {
        return mapper;
    }
}
