package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CreneauHoraireBasicDTO;
import rm_school_api.dto.basic.TypeCreneauBasicDTO;
import rm_school_api.dto.full.CreneauHoraireFullDTO;
import rm_school_api.entity.CreneauHoraire;
import rm_school_api.entity.TypeCreneau;

@Mapper(componentModel = "spring")
public interface CreneauHoraireMapper extends AbstractMapper<CreneauHoraire, CreneauHoraireBasicDTO, CreneauHoraireFullDTO> {
    @Mapping(source = "typeCreneau.id", target = "typeCreneauId")
    CreneauHoraireBasicDTO toBasicDTO(CreneauHoraire entity);

    @Mapping(source = "typeCreneau.id", target = "typeCreneauId")
    CreneauHoraireFullDTO toFullDTO(CreneauHoraire entity);

    @Mapping(target = "typeCreneau", ignore = true)
    CreneauHoraire toEntity(CreneauHoraireBasicDTO dto);

    CreneauHoraire toEntity(CreneauHoraireFullDTO dto);

    TypeCreneauBasicDTO toBasicDTO(TypeCreneau entity);

    TypeCreneau toEntity(TypeCreneauBasicDTO dto);
}
