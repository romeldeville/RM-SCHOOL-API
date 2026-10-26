package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.CoursEnseignantBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.basic.NoteBasicDTO;
import rm_school_api.dto.full.NoteFullDTO;
import rm_school_api.entity.CoursEnseignant;
import rm_school_api.entity.Inscription;
import rm_school_api.entity.Note;

@Mapper(componentModel = "spring")
public interface NoteMapper extends AbstractMapper<Note, NoteBasicDTO, NoteFullDTO> {
    @Mapping(source = "inscription.id", target = "inscriptionId")
    @Mapping(source = "coursEnseignant.id", target = "coursEnseignantId")
    NoteBasicDTO toBasicDTO(Note entity);

    @Mapping(source = "inscription.id", target = "inscriptionId")
    @Mapping(source = "coursEnseignant.id", target = "coursEnseignantId")
    NoteFullDTO toFullDTO(Note entity);

    @Mapping(target = "inscription", ignore = true)
    @Mapping(target = "coursEnseignant", ignore = true)
    Note toEntity(NoteBasicDTO dto);

    Note toEntity(NoteFullDTO dto);

    @Mapping(source = "eleve.id", target = "eleveId")
    @Mapping(source = "classe.id", target = "classeId")
    InscriptionBasicDTO toBasicDTO(Inscription entity);

    @Mapping(source = "courNiveau.id", target = "courNiveauId")
    @Mapping(source = "classe.id", target = "classeId")
    @Mapping(source = "informationsPersonnel.id", target = "informationsPersonnelId")
    CoursEnseignantBasicDTO toBasicDTO(CoursEnseignant entity);

    @Mapping(target = "eleve", ignore = true)
    @Mapping(target = "classe", ignore = true)
    Inscription toEntity(InscriptionBasicDTO dto);

    @Mapping(target = "courNiveau", ignore = true)
    @Mapping(target = "classe", ignore = true)
    @Mapping(target = "informationsPersonnel", ignore = true)
    CoursEnseignant toEntity(CoursEnseignantBasicDTO dto);
}
