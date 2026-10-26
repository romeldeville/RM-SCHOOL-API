package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "PENSION")
@AttributeOverride(name = "id", column = @Column(name = "ID_PENSION"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Pension extends AbstractEntity {

    @NotBlank(message = "la description ne doit pas être vide")
    @Size(max = 500, message = "la description ne doit pas dépasser 500 caractères")
    @Column(name = "DESCRIPTION", nullable = false, length = 500)
    private String description;
}
