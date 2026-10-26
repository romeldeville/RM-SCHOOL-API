package rm_school_api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public abstract class AbstractDTO {
    private Long id;
    private LocalDateTime dateEnregistrement;
    private LocalDateTime dateModification;
    private Long responsableEnregistrement;
    private Long responsableModification;
}
