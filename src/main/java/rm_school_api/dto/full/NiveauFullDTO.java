package rm_school_api.dto.full;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CycleBasicDTO;
import rm_school_api.dto.basic.ExamenBasicDTO;
import rm_school_api.dto.basic.NiveauBasicDTO;
import rm_school_api.dto.basic.PensionBasicDTO;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class NiveauFullDTO extends NiveauBasicDTO {
    private CycleBasicDTO cycle;
    private PensionBasicDTO pension;

    @Builder.Default
    private Set<ExamenBasicDTO> examens = new HashSet<>();
}
