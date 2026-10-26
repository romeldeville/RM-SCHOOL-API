package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.GroupeBasicDTO;
import rm_school_api.dto.full.GroupeFullDTO;
import rm_school_api.entity.Groupe;

@Mapper(componentModel = "spring")
public interface GroupeMapper {
    GroupeBasicDTO toBasicDTO(Groupe entity);

    GroupeFullDTO toFullDTO(Groupe entity);

    Groupe toEntity(GroupeBasicDTO dto);

    Groupe toEntity(GroupeFullDTO dto);
}
