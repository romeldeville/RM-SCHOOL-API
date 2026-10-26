package rm_school_api.dto.full;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.ExamenBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class ExamenFullDTO extends ExamenBasicDTO {
    @Builder.Default
    private Set<NiveauBasicDTO> niveaux = new HashSet<>();
}
