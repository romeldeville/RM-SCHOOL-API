package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.ClasseBasicDTO;
import rm_school_api.dto.basic.CoursEnseignantBasicDTO;
import rm_school_api.dto.basic.CourNiveauBasicDTO;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CoursEnseignantFullDTO extends CoursEnseignantBasicDTO {
    private CourNiveauBasicDTO courNiveau;
    private ClasseBasicDTO classe;
    private InformationsPersonnelBasicDTO informationsPersonnel;
}
