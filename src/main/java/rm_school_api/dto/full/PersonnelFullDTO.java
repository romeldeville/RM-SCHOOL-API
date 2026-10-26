package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CompteUtilisateurBasicDTO;
import rm_school_api.dto.basic.PersonnelBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PersonnelFullDTO extends PersonnelBasicDTO {
    private CompteUtilisateurBasicDTO compteUtilisateur;
}
