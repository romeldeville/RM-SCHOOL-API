package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.DisciplineBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.full.DisciplineFullDTO;
import rm_school_api.entity.Discipline;
import rm_school_api.entity.Inscription;

@Mapper(componentModel = "spring")
public interface DisciplineMapper extends AbstractMapper<Discipline, DisciplineBasicDTO, DisciplineFullDTO> {
    @Mapping(source = "inscription.id", target = "inscriptionId")
    DisciplineBasicDTO toBasicDTO(Discipline entity);

    @Mapping(source = "inscription.id", target = "inscriptionId")
    DisciplineFullDTO toFullDTO(Discipline entity);

    @Mapping(target = "inscription", ignore = true)
    Discipline toEntity(DisciplineBasicDTO dto);

    Discipline toEntity(DisciplineFullDTO dto);

    @Mapping(source = "eleve.id", target = "eleveId")
    @Mapping(source = "classe.id", target = "classeId")
    InscriptionBasicDTO toBasicDTO(Inscription entity);

    @Mapping(target = "eleve", ignore = true)
    @Mapping(target = "classe", ignore = true)
    Inscription toEntity(InscriptionBasicDTO dto);
}
