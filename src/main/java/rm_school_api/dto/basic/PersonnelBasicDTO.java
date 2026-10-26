package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PersonnelBasicDTO extends AbstractDTO {
    private String nom;
    private String prenom;
    private String sexe;
    private String contacts;
    private LocalDate dateNaissance;
    private String lieuNaissance;
    private String ethnie;
    private String nomPere;
    private String nomMere;
    private Long compteUtilisateurId;
}
