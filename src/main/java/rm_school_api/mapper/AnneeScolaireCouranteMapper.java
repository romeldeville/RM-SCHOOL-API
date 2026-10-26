package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.basic.AnneeScolaireCouranteBasicDTO;
import rm_school_api.dto.full.AnneeScolaireCouranteFullDTO;
import rm_school_api.entity.AnneeScolaire;
import rm_school_api.entity.AnneeScolaireCourante;

@Mapper(componentModel = "spring")
public interface AnneeScolaireCouranteMapper {
    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    AnneeScolaireCouranteBasicDTO toBasicDTO(AnneeScolaireCourante entity);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    AnneeScolaireCouranteFullDTO toFullDTO(AnneeScolaireCourante entity);

    @Mapping(target = "anneeScolaire", ignore = true)
    AnneeScolaireCourante toEntity(AnneeScolaireCouranteBasicDTO dto);

    AnneeScolaireCourante toEntity(AnneeScolaireCouranteFullDTO dto);

    AnneeScolaireBasicDTO toBasicDTO(AnneeScolaire entity);

    AnneeScolaire toEntity(AnneeScolaireBasicDTO dto);
}
