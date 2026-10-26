package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.basic.EtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.full.InformationsEtablissementScolaireFullDTO;
import rm_school_api.entity.AnneeScolaire;
import rm_school_api.entity.EtablissementScolaire;
import rm_school_api.entity.InformationsEtablissementScolaire;

@Mapper(componentModel = "spring")
public interface InformationsEtablissementScolaireMapper extends AbstractMapper<InformationsEtablissementScolaire, InformationsEtablissementScolaireBasicDTO, InformationsEtablissementScolaireFullDTO> {
    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    @Mapping(source = "etablissementScolaire.id", target = "etablissementScolaireId")
    InformationsEtablissementScolaireBasicDTO toBasicDTO(InformationsEtablissementScolaire entity);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    @Mapping(source = "etablissementScolaire.id", target = "etablissementScolaireId")
    InformationsEtablissementScolaireFullDTO toFullDTO(InformationsEtablissementScolaire entity);

    @Mapping(target = "anneeScolaire", ignore = true)
    @Mapping(target = "etablissementScolaire", ignore = true)
    InformationsEtablissementScolaire toEntity(InformationsEtablissementScolaireBasicDTO dto);

    InformationsEtablissementScolaire toEntity(InformationsEtablissementScolaireFullDTO dto);

    AnneeScolaireBasicDTO toBasicDTO(AnneeScolaire entity);

    EtablissementScolaireBasicDTO toBasicDTO(EtablissementScolaire entity);

    AnneeScolaire toEntity(AnneeScolaireBasicDTO dto);

    EtablissementScolaire toEntity(EtablissementScolaireBasicDTO dto);
}
