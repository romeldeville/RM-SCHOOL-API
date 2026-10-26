package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.ExamenBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;
import rm_school_api.dto.full.ExamenFullDTO;
import rm_school_api.entity.Examen;
import rm_school_api.entity.Niveau;

@Mapper(componentModel = "spring")
public interface ExamenMapper {
    ExamenBasicDTO toBasicDTO(Examen entity);

    ExamenFullDTO toFullDTO(Examen entity);

    @Mapping(target = "niveaux", ignore = true)
    Examen toEntity(ExamenBasicDTO dto);

    Examen toEntity(ExamenFullDTO dto);

    @Mapping(source = "cycle.id", target = "cycleId")
    @Mapping(source = "pension.id", target = "pensionId")
    NiveauBasicDTO toBasicDTO(Niveau entity);

    @Mapping(target = "cycle", ignore = true)
    @Mapping(target = "pension", ignore = true)
    @Mapping(target = "examens", ignore = true)
    Niveau toEntity(NiveauBasicDTO dto);
}
