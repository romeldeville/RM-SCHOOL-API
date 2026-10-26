package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.AbsenceEleveBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AbsenceEleveFullDTO extends AbsenceEleveBasicDTO {
    private InscriptionBasicDTO inscription;
}
