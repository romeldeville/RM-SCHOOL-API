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
public class AbsencePersonnelBasicDTO extends AbstractDTO {
    private LocalDate dateAbsence;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String motif;
    private String typeAbsence;
    private String commentaire;
    private String documentPath;
    private Boolean approuve;
    private LocalDate dateApprobation;
    private Long approuvePar;
    private Long informationsPersonnelId;
}
