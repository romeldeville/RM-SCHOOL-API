package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CycleBasicDTO;
import rm_school_api.dto.basic.SectionBasicDTO;
import rm_school_api.dto.full.CycleFullDTO;
import rm_school_api.entity.Cycle;
import rm_school_api.entity.Section;

@Mapper(componentModel = "spring")
public interface CycleMapper extends AbstractMapper<Cycle, CycleBasicDTO, CycleFullDTO> {
    @Mapping(source = "section.id", target = "sectionId")
    CycleBasicDTO toBasicDTO(Cycle entity);

    @Mapping(source = "section.id", target = "sectionId")
    CycleFullDTO toFullDTO(Cycle entity);

    @Mapping(target = "section", ignore = true)
    Cycle toEntity(CycleBasicDTO dto);

    Cycle toEntity(CycleFullDTO dto);

    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    SectionBasicDTO toBasicDTO(Section entity);

    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    Section toEntity(SectionBasicDTO dto);
}
