package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.basic.EtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InformationsEtablissementScolaireFullDTO extends InformationsEtablissementScolaireBasicDTO {
    private AnneeScolaireBasicDTO anneeScolaire;
    private EtablissementScolaireBasicDTO etablissementScolaire;
}
