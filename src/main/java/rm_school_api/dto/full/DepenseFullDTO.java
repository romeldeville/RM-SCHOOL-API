package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.DepenseBasicDTO;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class DepenseFullDTO extends DepenseBasicDTO {
    private InformationsEtablissementScolaireBasicDTO informationsEtablissementScolaire;
}
