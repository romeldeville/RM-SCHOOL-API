package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.MatiereBasicDTO;
import rm_school_api.dto.full.MatiereFullDTO;
import rm_school_api.entity.Matiere;

@Mapper(componentModel = "spring")
public interface MatiereMapper {
    MatiereBasicDTO toBasicDTO(Matiere entity);

    MatiereFullDTO toFullDTO(Matiere entity);

    Matiere toEntity(MatiereBasicDTO dto);

    Matiere toEntity(MatiereFullDTO dto);
}
