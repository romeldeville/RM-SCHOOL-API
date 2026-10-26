package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.ClasseBasicDTO;
import rm_school_api.dto.basic.CourNiveauBasicDTO;
import rm_school_api.dto.basic.CoursEnseignantBasicDTO;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;
import rm_school_api.dto.full.CoursEnseignantFullDTO;
import rm_school_api.entity.Classe;
import rm_school_api.entity.CourNiveau;
import rm_school_api.entity.CoursEnseignant;
import rm_school_api.entity.InformationsPersonnel;

@Mapper(componentModel = "spring")
public interface CoursEnseignantMapper extends AbstractMapper<CoursEnseignant, CoursEnseignantBasicDTO, CoursEnseignantFullDTO> {
    @Mapping(source = "courNiveau.id", target = "courNiveauId")
    @Mapping(source = "classe.id", target = "classeId")
    @Mapping(source = "informationsPersonnel.id", target = "informationsPersonnelId")
    CoursEnseignantBasicDTO toBasicDTO(CoursEnseignant entity);

    @Mapping(source = "courNiveau.id", target = "courNiveauId")
    @Mapping(source = "classe.id", target = "classeId")
    @Mapping(source = "informationsPersonnel.id", target = "informationsPersonnelId")
    CoursEnseignantFullDTO toFullDTO(CoursEnseignant entity);

    @Mapping(target = "courNiveau", ignore = true)
    @Mapping(target = "classe", ignore = true)
    @Mapping(target = "informationsPersonnel", ignore = true)
    CoursEnseignant toEntity(CoursEnseignantBasicDTO dto);

    CoursEnseignant toEntity(CoursEnseignantFullDTO dto);

    @Mapping(source = "groupe.id", target = "groupeId")
    @Mapping(source = "matiere.id", target = "matiereId")
    @Mapping(source = "niveau.id", target = "niveauId")
    CourNiveauBasicDTO toBasicDTO(CourNiveau entity);

    @Mapping(source = "niveau.id", target = "niveauId")
    ClasseBasicDTO toBasicDTO(Classe entity);

    @Mapping(source = "personnel.id", target = "personnelId")
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    InformationsPersonnelBasicDTO toBasicDTO(InformationsPersonnel entity);

    @Mapping(target = "groupe", ignore = true)
    @Mapping(target = "matiere", ignore = true)
    @Mapping(target = "niveau", ignore = true)
    CourNiveau toEntity(CourNiveauBasicDTO dto);

    @Mapping(target = "niveau", ignore = true)
    Classe toEntity(ClasseBasicDTO dto);

    @Mapping(target = "personnel", ignore = true)
    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    InformationsPersonnel toEntity(InformationsPersonnelBasicDTO dto);
}
