package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.basic.PaiementBasicDTO;
import rm_school_api.dto.full.PaiementFullDTO;
import rm_school_api.entity.Inscription;
import rm_school_api.entity.Paiement;

@Mapper(componentModel = "spring")
public interface PaiementMapper {
    @Mapping(source = "inscription.id", target = "inscriptionId")
    PaiementBasicDTO toBasicDTO(Paiement entity);

    @Mapping(source = "inscription.id", target = "inscriptionId")
    PaiementFullDTO toFullDTO(Paiement entity);

    @Mapping(target = "inscription", ignore = true)
    Paiement toEntity(PaiementBasicDTO dto);

    Paiement toEntity(PaiementFullDTO dto);

    @Mapping(source = "eleve.id", target = "eleveId")
    @Mapping(source = "classe.id", target = "classeId")
    InscriptionBasicDTO toBasicDTO(Inscription entity);

    @Mapping(target = "eleve", ignore = true)
    @Mapping(target = "classe", ignore = true)
    Inscription toEntity(InscriptionBasicDTO dto);
}
