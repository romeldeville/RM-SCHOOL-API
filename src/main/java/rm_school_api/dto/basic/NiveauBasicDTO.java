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
public class NiveauBasicDTO extends AbstractDTO {
    private String nom;
    private Integer ageMinimalAdmis;
    private Integer ageMaximalAdmis;
    private Double moyenneAdmise;
    private Double moyennePassage;
    private Long cycleId;
    private Long pensionId;
}
