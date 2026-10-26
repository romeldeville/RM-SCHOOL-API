package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.DepenseBasicDTO;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.full.DepenseFullDTO;
import rm_school_api.entity.Depense;
import rm_school_api.entity.InformationsEtablissementScolaire;

@Mapper(componentModel = "spring")
public interface DepenseMapper {
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    DepenseBasicDTO toBasicDTO(Depense entity);

    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    DepenseFullDTO toFullDTO(Depense entity);

    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    Depense toEntity(DepenseBasicDTO dto);

    Depense toEntity(DepenseFullDTO dto);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    @Mapping(source = "etablissementScolaire.id", target = "etablissementScolaireId")
    InformationsEtablissementScolaireBasicDTO toBasicDTO(InformationsEtablissementScolaire entity);

    @Mapping(target = "anneeScolaire", ignore = true)
    @Mapping(target = "etablissementScolaire", ignore = true)
    InformationsEtablissementScolaire toEntity(InformationsEtablissementScolaireBasicDTO dto);
}
