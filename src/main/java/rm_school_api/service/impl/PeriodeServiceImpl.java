package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.PeriodeBasicDTO;
import rm_school_api.dto.full.PeriodeFullDTO;
import rm_school_api.entity.Periode;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.PeriodeMapper;
import rm_school_api.repository.PeriodeRepository;
import rm_school_api.service.PeriodeService;

@Service
@RequiredArgsConstructor
public class PeriodeServiceImpl extends AbstractServiceImpl<Periode, PeriodeBasicDTO, PeriodeFullDTO> implements PeriodeService {

    private final PeriodeRepository repository;
    private final PeriodeMapper mapper;

    @Override
    protected JpaRepository<Periode, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Periode, PeriodeBasicDTO, PeriodeFullDTO> getMapper() {
        return mapper;
    }
}
