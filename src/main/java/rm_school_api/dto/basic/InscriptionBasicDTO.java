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
public class InscriptionBasicDTO extends AbstractDTO {
    private Boolean redoublant;
    private String photo;
    private Long eleveId;
    private Long classeId;
}
