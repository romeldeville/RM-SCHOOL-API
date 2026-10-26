package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.ClasseBasicDTO;
import rm_school_api.dto.basic.EleveBasicDTO;
import rm_school_api.dto.basic.InscriptionBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InscriptionFullDTO extends InscriptionBasicDTO {
    private EleveBasicDTO eleve;
    private ClasseBasicDTO classe;
}
