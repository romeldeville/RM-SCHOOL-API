package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.DisciplineBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class DisciplineFullDTO extends DisciplineBasicDTO {
    private InscriptionBasicDTO inscription;
}
