package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CourNiveauBasicDTO;
import rm_school_api.dto.basic.GroupeBasicDTO;
import rm_school_api.dto.basic.MatiereBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;
import rm_school_api.dto.full.CourNiveauFullDTO;
import rm_school_api.entity.CourNiveau;
import rm_school_api.entity.Groupe;
import rm_school_api.entity.Matiere;
import rm_school_api.entity.Niveau;

@Mapper(componentModel = "spring")
public interface CourNiveauMapper {
    @Mapping(source = "groupe.id", target = "groupeId")
    @Mapping(source = "matiere.id", target = "matiereId")
    @Mapping(source = "niveau.id", target = "niveauId")
    CourNiveauBasicDTO toBasicDTO(CourNiveau entity);

    @Mapping(source = "groupe.id", target = "groupeId")
    @Mapping(source = "matiere.id", target = "matiereId")
    @Mapping(source = "niveau.id", target = "niveauId")
    CourNiveauFullDTO toFullDTO(CourNiveau entity);

    @Mapping(target = "groupe", ignore = true)
    @Mapping(target = "matiere", ignore = true)
    @Mapping(target = "niveau", ignore = true)
    CourNiveau toEntity(CourNiveauBasicDTO dto);

    CourNiveau toEntity(CourNiveauFullDTO dto);

    GroupeBasicDTO toBasicDTO(Groupe entity);

    MatiereBasicDTO toBasicDTO(Matiere entity);

    @Mapping(source = "cycle.id", target = "cycleId")
    @Mapping(source = "pension.id", target = "pensionId")
    NiveauBasicDTO toBasicDTO(Niveau entity);

    Groupe toEntity(GroupeBasicDTO dto);

    Matiere toEntity(MatiereBasicDTO dto);

    @Mapping(target = "cycle", ignore = true)
    @Mapping(target = "pension", ignore = true)
    @Mapping(target = "examens", ignore = true)
    Niveau toEntity(NiveauBasicDTO dto);
}
