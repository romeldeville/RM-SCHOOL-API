package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CourNiveauBasicDTO;
import rm_school_api.dto.basic.GroupeBasicDTO;
import rm_school_api.dto.basic.MatiereBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CourNiveauFullDTO extends CourNiveauBasicDTO {
    private GroupeBasicDTO groupe;
    private MatiereBasicDTO matiere;
    private NiveauBasicDTO niveau;
}
