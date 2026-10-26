package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.AnneeScolaireBasicDTO;
import rm_school_api.dto.basic.PeriodeBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PeriodeFullDTO extends PeriodeBasicDTO {
    private AnneeScolaireBasicDTO anneeScolaire;
}
