package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.FraisBasicDTO;
import rm_school_api.dto.basic.PensionBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class FraisFullDTO extends FraisBasicDTO {
    private PensionBasicDTO pension;
}
