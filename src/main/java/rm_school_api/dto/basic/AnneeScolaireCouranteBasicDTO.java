package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AnneeScolaireCouranteBasicDTO extends AbstractDTO {
    private Long anneeScolaireId;
}
