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
public class CompetenceBasicDTO extends AbstractDTO {
    private String competencePremiereEvaluation;
    private String competenceDeuxiemeEvaluation;
    private String competenceTroisiemeEvaluation;
    private String competenceQuatriemeEvaluation;
    private String competenceCinquiemeEvaluation;
    private String competenceSixiemeEvaluation;
    private String competenceSeptiemeEvaluation;
    private String competenceHuitiemeEvaluation;
    private String competenceNeuviemeEvaluation;
    private Long courNiveauId;
}
