package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CoursEnseignantBasicDTO;
import rm_school_api.dto.basic.CreneauHoraireBasicDTO;
import rm_school_api.dto.basic.JourSemaineBasicDTO;
import rm_school_api.dto.basic.LigneEmploiDuTempsBasicDTO;
import rm_school_api.dto.full.LigneEmploiDuTempsFullDTO;
import rm_school_api.entity.CoursEnseignant;
import rm_school_api.entity.CreneauHoraire;
import rm_school_api.entity.JourSemaine;
import rm_school_api.entity.LigneEmploiDuTemps;

@Mapper(componentModel = "spring")
public interface LigneEmploiDuTempsMapper extends AbstractMapper<LigneEmploiDuTemps, LigneEmploiDuTempsBasicDTO, LigneEmploiDuTempsFullDTO> {
    @Mapping(source = "jourSemaine.id", target = "jourSemaineId")
    @Mapping(source = "creneauHoraire.id", target = "creneauHoraireId")
    @Mapping(source = "coursEnseignant.id", target = "coursEnseignantId")
    LigneEmploiDuTempsBasicDTO toBasicDTO(LigneEmploiDuTemps entity);

    @Mapping(source = "jourSemaine.id", target = "jourSemaineId")
    @Mapping(source = "creneauHoraire.id", target = "creneauHoraireId")
    @Mapping(source = "coursEnseignant.id", target = "coursEnseignantId")
    LigneEmploiDuTempsFullDTO toFullDTO(LigneEmploiDuTemps entity);

    @Mapping(target = "jourSemaine", ignore = true)
    @Mapping(target = "creneauHoraire", ignore = true)
    @Mapping(target = "coursEnseignant", ignore = true)
    LigneEmploiDuTemps toEntity(LigneEmploiDuTempsBasicDTO dto);

    LigneEmploiDuTemps toEntity(LigneEmploiDuTempsFullDTO dto);

    JourSemaineBasicDTO toBasicDTO(JourSemaine entity);

    @Mapping(source = "typeCreneau.id", target = "typeCreneauId")
    CreneauHoraireBasicDTO toBasicDTO(CreneauHoraire entity);

    @Mapping(source = "courNiveau.id", target = "courNiveauId")
    @Mapping(source = "classe.id", target = "classeId")
    @Mapping(source = "informationsPersonnel.id", target = "informationsPersonnelId")
    CoursEnseignantBasicDTO toBasicDTO(CoursEnseignant entity);

    JourSemaine toEntity(JourSemaineBasicDTO dto);

    @Mapping(target = "typeCreneau", ignore = true)
    CreneauHoraire toEntity(CreneauHoraireBasicDTO dto);

    @Mapping(target = "courNiveau", ignore = true)
    @Mapping(target = "classe", ignore = true)
    @Mapping(target = "informationsPersonnel", ignore = true)
    CoursEnseignant toEntity(CoursEnseignantBasicDTO dto);
}
