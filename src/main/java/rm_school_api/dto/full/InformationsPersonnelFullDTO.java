package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.InformationsEtablissementScolaireBasicDTO;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;
import rm_school_api.dto.basic.PersonnelBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InformationsPersonnelFullDTO extends InformationsPersonnelBasicDTO {
    private PersonnelBasicDTO personnel;
    private InformationsEtablissementScolaireBasicDTO informationsEtablissementScolaire;
}
