package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.TypeCreneauBasicDTO;
import rm_school_api.dto.full.TypeCreneauFullDTO;
import rm_school_api.entity.TypeCreneau;

@Mapper(componentModel = "spring")
public interface TypeCreneauMapper {
    TypeCreneauBasicDTO toBasicDTO(TypeCreneau entity);

    TypeCreneauFullDTO toFullDTO(TypeCreneau entity);

    TypeCreneau toEntity(TypeCreneauBasicDTO dto);

    TypeCreneau toEntity(TypeCreneauFullDTO dto);
}
