package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.AbsenceEleveBasicDTO;
import rm_school_api.dto.full.AbsenceEleveFullDTO;
import rm_school_api.entity.AbsenceEleve;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.AbsenceEleveMapper;
import rm_school_api.repository.AbsenceEleveRepository;
import rm_school_api.service.AbsenceEleveService;

@Service
@RequiredArgsConstructor
public class AbsenceEleveServiceImpl extends AbstractServiceImpl<AbsenceEleve, AbsenceEleveBasicDTO, AbsenceEleveFullDTO> implements AbsenceEleveService {

    private final AbsenceEleveRepository repository;
    private final AbsenceEleveMapper mapper;

    @Override
    protected JpaRepository<AbsenceEleve, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<AbsenceEleve, AbsenceEleveBasicDTO, AbsenceEleveFullDTO> getMapper() {
        return mapper;
    }
}
