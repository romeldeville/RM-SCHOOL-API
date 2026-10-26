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
public class PeriodeBasicDTO extends AbstractDTO {
    private String nom;
    private String nomAnglais;
    private String abreviation;
    private String abreviationAnglais;
    private LocalDate debut;
    private LocalDate fin;
    private Boolean statut;
    private Long anneeScolaireId;
}
