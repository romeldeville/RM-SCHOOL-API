package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.SectionBasicDTO;
import rm_school_api.dto.full.SectionFullDTO;
import rm_school_api.entity.InformationsEtablissementScolaire;
import rm_school_api.entity.Section;

@Mapper(componentModel = "spring")
public interface SectionMapper extends AbstractMapper<Section, SectionBasicDTO, SectionFullDTO> {
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    SectionBasicDTO toBasicDTO(Section entity);

    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    SectionFullDTO toFullDTO(Section entity);

    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    Section toEntity(SectionBasicDTO dto);

    Section toEntity(SectionFullDTO dto);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    @Mapping(source = "etablissementScolaire.id", target = "etablissementScolaireId")
    InformationsEtablissementScolaireBasicDTO toBasicDTO(InformationsEtablissementScolaire entity);

    @Mapping(target = "anneeScolaire", ignore = true)
    @Mapping(target = "etablissementScolaire", ignore = true)
    InformationsEtablissementScolaire toEntity(InformationsEtablissementScolaireBasicDTO dto);
}
