package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.EtablissementScolaireBasicDTO;
import rm_school_api.dto.full.EtablissementScolaireFullDTO;
import rm_school_api.entity.EtablissementScolaire;

@Mapper(componentModel = "spring")
public interface EtablissementScolaireMapper extends AbstractMapper<EtablissementScolaire, EtablissementScolaireBasicDTO, EtablissementScolaireFullDTO> {
    EtablissementScolaireBasicDTO toBasicDTO(EtablissementScolaire entity);

    EtablissementScolaireFullDTO toFullDTO(EtablissementScolaire entity);

    EtablissementScolaire toEntity(EtablissementScolaireBasicDTO dto);

    EtablissementScolaire toEntity(EtablissementScolaireFullDTO dto);
}
