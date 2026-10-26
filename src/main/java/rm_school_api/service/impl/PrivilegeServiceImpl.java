package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.PrivilegeBasicDTO;
import rm_school_api.dto.full.PrivilegeFullDTO;
import rm_school_api.entity.Privilege;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.PrivilegeMapper;
import rm_school_api.repository.PrivilegeRepository;
import rm_school_api.service.PrivilegeService;

@Service
@RequiredArgsConstructor
public class PrivilegeServiceImpl extends AbstractServiceImpl<Privilege, PrivilegeBasicDTO, PrivilegeFullDTO> implements PrivilegeService {

    private final PrivilegeRepository repository;
    private final PrivilegeMapper mapper;

    @Override
    protected JpaRepository<Privilege, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Privilege, PrivilegeBasicDTO, PrivilegeFullDTO> getMapper() {
        return mapper;
    }
}
