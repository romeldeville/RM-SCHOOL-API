package rm_school_api.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
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
public class AnneeScolaire extends AbstractEntity {
    @NotBlank(message = "le nom ne doit pas être blanc")
    @NotNull(message = "le nom ne doit pas être vide")
    private String nom;
    private String description;
    @NotBlank(message = "le nom en anglais ne doit pas être blanc")
    @NotNull(message = "le nom en anglais ne doit pas être vide")
    private String nomAnglais;
    private String descriptionAnglais;
}