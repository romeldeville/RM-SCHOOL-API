package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.AbsenceEleveBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.full.AbsenceEleveFullDTO;
import rm_school_api.entity.AbsenceEleve;
import rm_school_api.entity.Inscription;

@Mapper(componentModel = "spring")
public interface AbsenceEleveMapper {
    @Mapping(source = "inscription.id", target = "inscriptionId")
    AbsenceEleveBasicDTO toBasicDTO(AbsenceEleve entity);

    @Mapping(source = "inscription.id", target = "inscriptionId")
    AbsenceEleveFullDTO toFullDTO(AbsenceEleve entity);

    @Mapping(target = "inscription", ignore = true)
    AbsenceEleve toEntity(AbsenceEleveBasicDTO dto);

    AbsenceEleve toEntity(AbsenceEleveFullDTO dto);

    @Mapping(source = "eleve.id", target = "eleveId")
    @Mapping(source = "classe.id", target = "classeId")
    InscriptionBasicDTO toBasicDTO(Inscription entity);

    @Mapping(target = "eleve", ignore = true)
    @Mapping(target = "classe", ignore = true)
    Inscription toEntity(InscriptionBasicDTO dto);
}
