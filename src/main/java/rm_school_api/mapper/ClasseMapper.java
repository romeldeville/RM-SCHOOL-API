package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.ClasseBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;
import rm_school_api.dto.full.ClasseFullDTO;
import rm_school_api.entity.Classe;
import rm_school_api.entity.Niveau;

@Mapper(componentModel = "spring")
public interface ClasseMapper {
    @Mapping(source = "niveau.id", target = "niveauId")
    ClasseBasicDTO toBasicDTO(Classe entity);

    @Mapping(source = "niveau.id", target = "niveauId")
    ClasseFullDTO toFullDTO(Classe entity);

    @Mapping(target = "niveau", ignore = true)
    Classe toEntity(ClasseBasicDTO dto);

    Classe toEntity(ClasseFullDTO dto);

    @Mapping(source = "cycle.id", target = "cycleId")
    @Mapping(source = "pension.id", target = "pensionId")
    NiveauBasicDTO toBasicDTO(Niveau entity);

    @Mapping(target = "cycle", ignore = true)
    @Mapping(target = "pension", ignore = true)
    @Mapping(target = "examens", ignore = true)
    Niveau toEntity(NiveauBasicDTO dto);
}
