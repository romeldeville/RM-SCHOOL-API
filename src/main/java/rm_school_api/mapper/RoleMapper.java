package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.PrivilegeBasicDTO;
import rm_school_api.dto.basic.RoleBasicDTO;
import rm_school_api.dto.full.RoleFullDTO;
import rm_school_api.entity.Privilege;
import rm_school_api.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleBasicDTO toBasicDTO(Role entity);

    RoleFullDTO toFullDTO(Role entity);

    @Mapping(target = "privileges", ignore = true)
    Role toEntity(RoleBasicDTO dto);

    Role toEntity(RoleFullDTO dto);

    PrivilegeBasicDTO toBasicDTO(Privilege entity);

    @Mapping(target = "roles", ignore = true)
    Privilege toEntity(PrivilegeBasicDTO dto);
}
