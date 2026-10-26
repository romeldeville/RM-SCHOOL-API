package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.PrivilegeBasicDTO;
import rm_school_api.dto.basic.RoleBasicDTO;
import rm_school_api.dto.full.PrivilegeFullDTO;
import rm_school_api.entity.Privilege;
import rm_school_api.entity.Role;

@Mapper(componentModel = "spring")
public interface PrivilegeMapper {
    PrivilegeBasicDTO toBasicDTO(Privilege entity);

    PrivilegeFullDTO toFullDTO(Privilege entity);

    @Mapping(target = "roles", ignore = true)
    Privilege toEntity(PrivilegeBasicDTO dto);

    Privilege toEntity(PrivilegeFullDTO dto);

    RoleBasicDTO toBasicDTO(Role entity);

    @Mapping(target = "privileges", ignore = true)
    Role toEntity(RoleBasicDTO dto);
}
