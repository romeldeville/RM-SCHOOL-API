package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class ParametreBasicDTO extends AbstractDTO {
    private Integer nombreEvaluationsTrimestrielles;
    private String surfixeEnteteDocument;
    private LocalDate dateRentreeScolaire;
    private Long informationsEtablissementScolaireId;
}
