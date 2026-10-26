package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class NoteBasicDTO extends AbstractDTO {
    private Double premiereEvaluation;
    private Double deuxiemeEvaluation;
    private Double troisiemeEvaluation;
    private Double quatriemeEvaluation;
    private Double cinquiemeEvaluation;
    private Double sixiemeEvaluation;
    private Double septiemeEvaluation;
    private Double huitiemeEvaluation;
    private Double neuviemeEvaluation;
    private Long inscriptionId;
    private Long coursEnseignantId;
}
