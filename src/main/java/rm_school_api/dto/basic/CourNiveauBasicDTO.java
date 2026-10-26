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
public class CourNiveauBasicDTO extends AbstractDTO {
    private Double coefficient;
    private Double nombreHeuresHebdo;
    private Long groupeId;
    private Long matiereId;
    private Long niveauId;
}
