package rm_school_api.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Pension extends AbstractEntity {
    @NotNull(message = "la description ne doit pas être null")
    private String description;

    @NotNull(message = "la description anglaise ne doit pas être null")
    private String descriptionAnglais;
}
