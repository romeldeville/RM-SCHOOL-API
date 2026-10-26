package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.GroupeBasicDTO;
import rm_school_api.dto.full.GroupeFullDTO;
import rm_school_api.entity.Groupe;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.GroupeMapper;
import rm_school_api.repository.GroupeRepository;
import rm_school_api.service.GroupeService;

@Service
@RequiredArgsConstructor
public class GroupeServiceImpl extends AbstractServiceImpl<Groupe, GroupeBasicDTO, GroupeFullDTO> implements GroupeService {

    private final GroupeRepository repository;
    private final GroupeMapper mapper;

    @Override
    protected JpaRepository<Groupe, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Groupe, GroupeBasicDTO, GroupeFullDTO> getMapper() {
        return mapper;
    }
}
