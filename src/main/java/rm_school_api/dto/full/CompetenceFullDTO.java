package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CompetenceBasicDTO;
import rm_school_api.dto.basic.CourNiveauBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CompetenceFullDTO extends CompetenceBasicDTO {
    private CourNiveauBasicDTO courNiveau;
}
