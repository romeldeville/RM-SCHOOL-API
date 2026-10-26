package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.ParametreBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class ParametreFullDTO extends ParametreBasicDTO {
    private InformationsEtablissementScolaireBasicDTO informationsEtablissementScolaire;
}
