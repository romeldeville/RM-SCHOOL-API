package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.basic.PaiementBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PaiementFullDTO extends PaiementBasicDTO {
    private InscriptionBasicDTO inscription;
}
