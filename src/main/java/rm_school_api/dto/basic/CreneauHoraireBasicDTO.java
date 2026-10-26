package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CreneauHoraireBasicDTO extends AbstractDTO {
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private Integer ordre;
    private Long typeCreneauId;
}
