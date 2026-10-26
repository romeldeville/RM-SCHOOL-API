package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.basic.PeriodeBasicDTO;
import rm_school_api.dto.full.PeriodeFullDTO;
import rm_school_api.entity.AnneeScolaire;
import rm_school_api.entity.Periode;

@Mapper(componentModel = "spring")
public interface PeriodeMapper {
    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    PeriodeBasicDTO toBasicDTO(Periode entity);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    PeriodeFullDTO toFullDTO(Periode entity);

    @Mapping(target = "anneeScolaire", ignore = true)
    Periode toEntity(PeriodeBasicDTO dto);

    Periode toEntity(PeriodeFullDTO dto);

    AnneeScolaireBasicDTO toBasicDTO(AnneeScolaire entity);

    AnneeScolaire toEntity(AnneeScolaireBasicDTO dto);
}
