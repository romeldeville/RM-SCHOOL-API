package rm_school_api.dto.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.AbstractDTO;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class PaiementBasicDTO extends AbstractDTO {
    private String motif;
    private LocalDateTime datePaiement;
    private Double montant;
    private String devise;
    private Long inscriptionId;
}
