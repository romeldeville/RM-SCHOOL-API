package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CompteUtilisateurBasicDTO;
import rm_school_api.dto.basic.EleveBasicDTO;
import rm_school_api.dto.full.EleveFullDTO;
import rm_school_api.entity.CompteUtilisateur;
import rm_school_api.entity.Eleve;

@Mapper(componentModel = "spring")
public interface EleveMapper {
    @Mapping(source = "compteUtilisateur.id", target = "compteUtilisateurId")
    EleveBasicDTO toBasicDTO(Eleve entity);

    @Mapping(source = "compteUtilisateur.id", target = "compteUtilisateurId")
    EleveFullDTO toFullDTO(Eleve entity);

    @Mapping(target = "compteUtilisateur", ignore = true)
    Eleve toEntity(EleveBasicDTO dto);

    Eleve toEntity(EleveFullDTO dto);

    @Mapping(source = "statutCompteUtilisateur.id", target = "statutCompteUtilisateurId")
    @Mapping(source = "role.id", target = "roleId")
    CompteUtilisateurBasicDTO toBasicDTO(CompteUtilisateur entity);

    @Mapping(target = "statutCompteUtilisateur", ignore = true)
    @Mapping(target = "role", ignore = true)
    CompteUtilisateur toEntity(CompteUtilisateurBasicDTO dto);
}
