package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.AbsencePersonnelBasicDTO;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;
import rm_school_api.dto.full.AbsencePersonnelFullDTO;
import rm_school_api.entity.AbsencePersonnel;
import rm_school_api.entity.InformationsPersonnel;

@Mapper(componentModel = "spring")
public interface AbsencePersonnelMapper {
    @Mapping(source = "informationsPersonnel.id", target = "informationsPersonnelId")
    AbsencePersonnelBasicDTO toBasicDTO(AbsencePersonnel entity);

    @Mapping(source = "informationsPersonnel.id", target = "informationsPersonnelId")
    AbsencePersonnelFullDTO toFullDTO(AbsencePersonnel entity);

    @Mapping(target = "informationsPersonnel", ignore = true)
    AbsencePersonnel toEntity(AbsencePersonnelBasicDTO dto);

    AbsencePersonnel toEntity(AbsencePersonnelFullDTO dto);

    @Mapping(source = "personnel.id", target = "personnelId")
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    InformationsPersonnelBasicDTO toBasicDTO(InformationsPersonnel entity);

    @Mapping(target = "personnel", ignore = true)
    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    InformationsPersonnel toEntity(InformationsPersonnelBasicDTO dto);
}
