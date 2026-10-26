package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.ClasseBasicDTO;
import rm_school_api.dto.basic.EleveBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.full.InscriptionFullDTO;
import rm_school_api.entity.Classe;
import rm_school_api.entity.Eleve;
import rm_school_api.entity.Inscription;

@Mapper(componentModel = "spring")
public interface InscriptionMapper {
    @Mapping(source = "eleve.id", target = "eleveId")
    @Mapping(source = "classe.id", target = "classeId")
    InscriptionBasicDTO toBasicDTO(Inscription entity);

    @Mapping(source = "eleve.id", target = "eleveId")
    @Mapping(source = "classe.id", target = "classeId")
    InscriptionFullDTO toFullDTO(Inscription entity);

    @Mapping(target = "eleve", ignore = true)
    @Mapping(target = "classe", ignore = true)
    Inscription toEntity(InscriptionBasicDTO dto);

    Inscription toEntity(InscriptionFullDTO dto);

    @Mapping(source = "compteUtilisateur.id", target = "compteUtilisateurId")
    EleveBasicDTO toBasicDTO(Eleve entity);

    @Mapping(source = "niveau.id", target = "niveauId")
    ClasseBasicDTO toBasicDTO(Classe entity);

    @Mapping(target = "compteUtilisateur", ignore = true)
    Eleve toEntity(EleveBasicDTO dto);

    @Mapping(target = "niveau", ignore = true)
    Classe toEntity(ClasseBasicDTO dto);
}
