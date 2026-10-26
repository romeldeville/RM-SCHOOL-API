package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CycleBasicDTO;
import rm_school_api.dto.basic.SectionBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CycleFullDTO extends CycleBasicDTO {
    private SectionBasicDTO section;
}
