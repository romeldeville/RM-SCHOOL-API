package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CompteUtilisateurBasicDTO;
import rm_school_api.dto.basic.PersonnelBasicDTO;
import rm_school_api.dto.full.PersonnelFullDTO;
import rm_school_api.entity.CompteUtilisateur;
import rm_school_api.entity.Personnel;

@Mapper(componentModel = "spring")
public interface PersonnelMapper {
    @Mapping(source = "compteUtilisateur.id", target = "compteUtilisateurId")
    PersonnelBasicDTO toBasicDTO(Personnel entity);

    @Mapping(source = "compteUtilisateur.id", target = "compteUtilisateurId")
    PersonnelFullDTO toFullDTO(Personnel entity);

    @Mapping(target = "compteUtilisateur", ignore = true)
    Personnel toEntity(PersonnelBasicDTO dto);

    Personnel toEntity(PersonnelFullDTO dto);

    @Mapping(source = "statutCompteUtilisateur.id", target = "statutCompteUtilisateurId")
    @Mapping(source = "role.id", target = "roleId")
    CompteUtilisateurBasicDTO toBasicDTO(CompteUtilisateur entity);

    @Mapping(target = "statutCompteUtilisateur", ignore = true)
    @Mapping(target = "role", ignore = true)
    CompteUtilisateur toEntity(CompteUtilisateurBasicDTO dto);
}
