package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.full.AnneeScolaireFullDTO;
import rm_school_api.entity.AnneeScolaire;

@Mapper(componentModel = "spring")
public interface AnneeScolaireMapper extends AbstractMapper<AnneeScolaire, AnneeScolaireBasicDTO, AnneeScolaireFullDTO> {
    AnneeScolaireBasicDTO toBasicDTO(AnneeScolaire entity);

    AnneeScolaireFullDTO toFullDTO(AnneeScolaire entity);

    AnneeScolaire toEntity(AnneeScolaireBasicDTO dto);

    AnneeScolaire toEntity(AnneeScolaireFullDTO dto);
}
