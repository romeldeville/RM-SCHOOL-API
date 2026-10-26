package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.AbsencePersonnelBasicDTO;
import rm_school_api.dto.basic.InformationsPersonnelBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AbsencePersonnelFullDTO extends AbsencePersonnelBasicDTO {
    private InformationsPersonnelBasicDTO informationsPersonnel;
}
