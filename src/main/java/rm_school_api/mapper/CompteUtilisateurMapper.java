package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CompteUtilisateurBasicDTO;
import rm_school_api.dto.basic.RoleBasicDTO;
import rm_school_api.dto.basic.StatutCompteUtilisateurBasicDTO;
import rm_school_api.dto.full.CompteUtilisateurFullDTO;
import rm_school_api.entity.CompteUtilisateur;
import rm_school_api.entity.Role;
import rm_school_api.entity.StatutCompteUtilisateur;

@Mapper(componentModel = "spring")
public interface CompteUtilisateurMapper extends AbstractMapper<CompteUtilisateur, CompteUtilisateurBasicDTO, CompteUtilisateurFullDTO> {
    @Mapping(source = "statutCompteUtilisateur.id", target = "statutCompteUtilisateurId")
    @Mapping(source = "role.id", target = "roleId")
    CompteUtilisateurBasicDTO toBasicDTO(CompteUtilisateur entity);

    @Mapping(source = "statutCompteUtilisateur.id", target = "statutCompteUtilisateurId")
    @Mapping(source = "role.id", target = "roleId")
    CompteUtilisateurFullDTO toFullDTO(CompteUtilisateur entity);

    @Mapping(target = "statutCompteUtilisateur", ignore = true)
    @Mapping(target = "role", ignore = true)
    CompteUtilisateur toEntity(CompteUtilisateurBasicDTO dto);

    CompteUtilisateur toEntity(CompteUtilisateurFullDTO dto);

    StatutCompteUtilisateurBasicDTO toBasicDTO(StatutCompteUtilisateur entity);

    RoleBasicDTO toBasicDTO(Role entity);

    StatutCompteUtilisateur toEntity(StatutCompteUtilisateurBasicDTO dto);

    @Mapping(target = "privileges", ignore = true)
    Role toEntity(RoleBasicDTO dto);
}
