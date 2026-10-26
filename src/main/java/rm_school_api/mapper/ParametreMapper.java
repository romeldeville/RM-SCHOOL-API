package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.ParametreBasicDTO;
import rm_school_api.dto.full.ParametreFullDTO;
import rm_school_api.entity.InformationsEtablissementScolaire;
import rm_school_api.entity.Parametre;

@Mapper(componentModel = "spring")
public interface ParametreMapper extends AbstractMapper<Parametre, ParametreBasicDTO, ParametreFullDTO> {
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    ParametreBasicDTO toBasicDTO(Parametre entity);

    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    ParametreFullDTO toFullDTO(Parametre entity);

    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    Parametre toEntity(ParametreBasicDTO dto);

    Parametre toEntity(ParametreFullDTO dto);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    @Mapping(source = "etablissementScolaire.id", target = "etablissementScolaireId")
    InformationsEtablissementScolaireBasicDTO toBasicDTO(InformationsEtablissementScolaire entity);

    @Mapping(target = "anneeScolaire", ignore = true)
    @Mapping(target = "etablissementScolaire", ignore = true)
    InformationsEtablissementScolaire toEntity(InformationsEtablissementScolaireBasicDTO dto);
}
