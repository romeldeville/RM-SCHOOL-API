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
public class SectionBasicDTO extends AbstractDTO {
    private String nom;
    private String nomAnglais;
    private String description;
    private String descriptionAnglais;
    private Long informationsEtablissementScolaireId;
}
