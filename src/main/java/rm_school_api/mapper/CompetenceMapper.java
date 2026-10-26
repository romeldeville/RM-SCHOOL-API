package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CompetenceBasicDTO;
import rm_school_api.dto.basic.CourNiveauBasicDTO;
import rm_school_api.dto.full.CompetenceFullDTO;
import rm_school_api.entity.Competence;
import rm_school_api.entity.CourNiveau;

@Mapper(componentModel = "spring")
public interface CompetenceMapper {
    @Mapping(source = "courNiveau.id", target = "courNiveauId")
    CompetenceBasicDTO toBasicDTO(Competence entity);

    @Mapping(source = "courNiveau.id", target = "courNiveauId")
    CompetenceFullDTO toFullDTO(Competence entity);

    @Mapping(target = "courNiveau", ignore = true)
    Competence toEntity(CompetenceBasicDTO dto);

    Competence toEntity(CompetenceFullDTO dto);

    @Mapping(source = "groupe.id", target = "groupeId")
    @Mapping(source = "matiere.id", target = "matiereId")
    @Mapping(source = "niveau.id", target = "niveauId")
    CourNiveauBasicDTO toBasicDTO(CourNiveau entity);

    @Mapping(target = "groupe", ignore = true)
    @Mapping(target = "matiere", ignore = true)
    @Mapping(target = "niveau", ignore = true)
    CourNiveau toEntity(CourNiveauBasicDTO dto);
}
