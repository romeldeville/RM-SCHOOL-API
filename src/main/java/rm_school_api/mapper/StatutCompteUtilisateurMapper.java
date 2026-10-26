package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.StatutCompteUtilisateurBasicDTO;
import rm_school_api.dto.full.StatutCompteUtilisateurFullDTO;
import rm_school_api.entity.StatutCompteUtilisateur;

@Mapper(componentModel = "spring")
public interface StatutCompteUtilisateurMapper extends AbstractMapper<StatutCompteUtilisateur, StatutCompteUtilisateurBasicDTO, StatutCompteUtilisateurFullDTO> {
    StatutCompteUtilisateurBasicDTO toBasicDTO(StatutCompteUtilisateur entity);

    StatutCompteUtilisateurFullDTO toFullDTO(StatutCompteUtilisateur entity);

    StatutCompteUtilisateur toEntity(StatutCompteUtilisateurBasicDTO dto);

    StatutCompteUtilisateur toEntity(StatutCompteUtilisateurFullDTO dto);
}
