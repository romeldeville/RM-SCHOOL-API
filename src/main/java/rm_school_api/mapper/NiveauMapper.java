package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CycleBasicDTO;
import rm_school_api.dto.basic.ExamenBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;
import rm_school_api.dto.basic.PensionBasicDTO;
import rm_school_api.dto.full.NiveauFullDTO;
import rm_school_api.entity.Cycle;
import rm_school_api.entity.Examen;
import rm_school_api.entity.Niveau;
import rm_school_api.entity.Pension;

@Mapper(componentModel = "spring")
public interface NiveauMapper extends AbstractMapper<Niveau, NiveauBasicDTO, NiveauFullDTO> {
    @Mapping(source = "cycle.id", target = "cycleId")
    @Mapping(source = "pension.id", target = "pensionId")
    NiveauBasicDTO toBasicDTO(Niveau entity);

    @Mapping(source = "cycle.id", target = "cycleId")
    @Mapping(source = "pension.id", target = "pensionId")
    NiveauFullDTO toFullDTO(Niveau entity);

    @Mapping(target = "cycle", ignore = true)
    @Mapping(target = "pension", ignore = true)
    @Mapping(target = "examens", ignore = true)
    Niveau toEntity(NiveauBasicDTO dto);

    Niveau toEntity(NiveauFullDTO dto);

    @Mapping(source = "section.id", target = "sectionId")
    CycleBasicDTO toBasicDTO(Cycle entity);

    PensionBasicDTO toBasicDTO(Pension entity);

    ExamenBasicDTO toBasicDTO(Examen entity);

    @Mapping(target = "section", ignore = true)
    Cycle toEntity(CycleBasicDTO dto);

    Pension toEntity(PensionBasicDTO dto);

    @Mapping(target = "niveaux", ignore = true)
    Examen toEntity(ExamenBasicDTO dto);
}
