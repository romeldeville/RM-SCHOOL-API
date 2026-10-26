package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CompteUtilisateurBasicDTO;
import rm_school_api.dto.basic.RoleBasicDTO;
import rm_school_api.dto.basic.StatutCompteUtilisateurBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CompteUtilisateurFullDTO extends CompteUtilisateurBasicDTO {
    private StatutCompteUtilisateurBasicDTO statutCompteUtilisateur;
    private RoleBasicDTO role;
}
