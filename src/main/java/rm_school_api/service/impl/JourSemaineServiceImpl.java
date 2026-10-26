package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.JourSemaineBasicDTO;
import rm_school_api.dto.full.JourSemaineFullDTO;
import rm_school_api.entity.JourSemaine;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.JourSemaineMapper;
import rm_school_api.repository.JourSemaineRepository;
import rm_school_api.service.JourSemaineService;

@Service
@RequiredArgsConstructor
public class JourSemaineServiceImpl extends AbstractServiceImpl<JourSemaine, JourSemaineBasicDTO, JourSemaineFullDTO> implements JourSemaineService {

    private final JourSemaineRepository repository;
    private final JourSemaineMapper mapper;

    @Override
    protected JpaRepository<JourSemaine, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<JourSemaine, JourSemaineBasicDTO, JourSemaineFullDTO> getMapper() {
        return mapper;
    }
}
