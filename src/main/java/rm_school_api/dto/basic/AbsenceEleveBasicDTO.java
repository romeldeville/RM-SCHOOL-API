package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AbsenceEleveBasicDTO extends AbstractDTO {
    private LocalDate dateAppel;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String commentaire;
    private String justificatif;
    private String documentPath;
    private Boolean valide;
    private LocalDate dateValidation;
    private Long validePar;
    private Long inscriptionId;
}
