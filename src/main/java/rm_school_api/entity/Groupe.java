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
@Table(name = "GROUPE")
@AttributeOverride(name = "id", column = @Column(name = "ID_GROUPE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Groupe extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 100, message = "le nom ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @NotBlank(message = "le nom en anglais ne doit pas être vide")
    @Size(max = 100, message = "le nom en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_ANGLAIS", nullable = false, length = 100)
    private String nomAnglais;

    @Size(max = 20, message = "l'abréviation ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION", length = 20)
    private String abreviation;

    @Size(max = 20, message = "l'abréviation en anglais ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION_ANGLAIS", length = 20)
    private String abreviationAnglais;

    @Size(max = 500, message = "la description ne doit pas dépasser 500 caractères")
    @Column(name = "DESCRIPTION", length = 500)
    private String description;

    @Size(max = 500, message = "la description en anglais ne doit pas dépasser 500 caractères")
    @Column(name = "DESCRIPTION_ANGLAIS", length = 500)
    private String descriptionAnglais;
}
