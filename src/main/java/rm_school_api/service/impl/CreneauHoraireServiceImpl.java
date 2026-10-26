package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.CreneauHoraireBasicDTO;
import rm_school_api.dto.full.CreneauHoraireFullDTO;
import rm_school_api.entity.CreneauHoraire;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.CreneauHoraireMapper;
import rm_school_api.repository.CreneauHoraireRepository;
import rm_school_api.service.CreneauHoraireService;

@Service
@RequiredArgsConstructor
public class CreneauHoraireServiceImpl extends AbstractServiceImpl<CreneauHoraire, CreneauHoraireBasicDTO, CreneauHoraireFullDTO> implements CreneauHoraireService {

    private final CreneauHoraireRepository repository;
    private final CreneauHoraireMapper mapper;

    @Override
    protected JpaRepository<CreneauHoraire, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<CreneauHoraire, CreneauHoraireBasicDTO, CreneauHoraireFullDTO> getMapper() {
        return mapper;
    }
}
