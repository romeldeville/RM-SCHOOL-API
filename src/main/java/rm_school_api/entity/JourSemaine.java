package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "JOUR_SEMAINE")
@AttributeOverride(name = "id", column = @Column(name = "ID_JOUR_SEMAINE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class JourSemaine extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 50, message = "le nom ne doit pas dépasser 50 caractères")
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @NotBlank(message = "le nom en anglais ne doit pas être vide")
    @Size(max = 50, message = "le nom en anglais ne doit pas dépasser 50 caractères")
    @Column(name = "NOM_ANGLAIS", nullable = false, length = 50)
    private String nomAnglais;

    @Size(max = 20, message = "l'abréviation ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION", length = 20)
    private String abreviation;

    @Size(max = 20, message = "l'abréviation en anglais ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION_ANGLAIS", length = 20)
    private String abreviationAnglais;

    @PositiveOrZero(message = "l'ordre doit être positif ou nul")
    @Column(name = "ORDRE")
    private Integer ordre;
}
