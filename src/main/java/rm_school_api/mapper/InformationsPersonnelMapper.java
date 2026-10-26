package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;
import rm_school_api.dto.basic.PersonnelBasicDTO;
import rm_school_api.dto.full.InformationsPersonnelFullDTO;
import rm_school_api.entity.InformationsEtablissementScolaire;
import rm_school_api.entity.InformationsPersonnel;
import rm_school_api.entity.Personnel;

@Mapper(componentModel = "spring")
public interface InformationsPersonnelMapper extends AbstractMapper<InformationsPersonnel, InformationsPersonnelBasicDTO, InformationsPersonnelFullDTO> {
    @Mapping(source = "personnel.id", target = "personnelId")
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    InformationsPersonnelBasicDTO toBasicDTO(InformationsPersonnel entity);

    @Mapping(source = "personnel.id", target = "personnelId")
    @Mapping(source = "informationsEtablissementScolaire.id", target = "informationsEtablissementScolaireId")
    InformationsPersonnelFullDTO toFullDTO(InformationsPersonnel entity);

    @Mapping(target = "personnel", ignore = true)
    @Mapping(target = "informationsEtablissementScolaire", ignore = true)
    InformationsPersonnel toEntity(InformationsPersonnelBasicDTO dto);

    InformationsPersonnel toEntity(InformationsPersonnelFullDTO dto);

    @Mapping(source = "compteUtilisateur.id", target = "compteUtilisateurId")
    PersonnelBasicDTO toBasicDTO(Personnel entity);

    @Mapping(source = "anneeScolaire.id", target = "anneeScolaireId")
    @Mapping(source = "etablissementScolaire.id", target = "etablissementScolaireId")
    InformationsEtablissementScolaireBasicDTO toBasicDTO(InformationsEtablissementScolaire entity);

    @Mapping(target = "compteUtilisateur", ignore = true)
    Personnel toEntity(PersonnelBasicDTO dto);

    @Mapping(target = "anneeScolaire", ignore = true)
    @Mapping(target = "etablissementScolaire", ignore = true)
    InformationsEtablissementScolaire toEntity(InformationsEtablissementScolaireBasicDTO dto);
}
