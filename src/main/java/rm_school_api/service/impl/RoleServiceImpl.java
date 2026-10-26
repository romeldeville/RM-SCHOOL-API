package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.RoleBasicDTO;
import rm_school_api.dto.full.RoleFullDTO;
import rm_school_api.entity.Role;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.RoleMapper;
import rm_school_api.repository.RoleRepository;
import rm_school_api.service.RoleService;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl extends AbstractServiceImpl<Role, RoleBasicDTO, RoleFullDTO> implements RoleService {

    private final RoleRepository repository;
    private final RoleMapper mapper;

    @Override
    protected JpaRepository<Role, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Role, RoleBasicDTO, RoleFullDTO> getMapper() {
        return mapper;
    }
}
