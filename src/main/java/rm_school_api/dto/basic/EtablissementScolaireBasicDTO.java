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
public class EtablissementScolaireBasicDTO extends AbstractDTO {
    private String immatriculation;
    private LocalDate dateCreation;
    private LocalDate dateOuverture;
    private String nomFondateur;
    private String contactFondateur;
}
