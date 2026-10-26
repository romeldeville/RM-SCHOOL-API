package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "CLASSE")
@AttributeOverride(name = "id", column = @Column(name = "ID_CLASSE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Classe extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 100, message = "le nom ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @Size(max = 20, message = "l'abréviation ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION", length = 20)
    private String abreviation;

    @NotNull(message = "le niveau est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_NIVEAU", nullable = false)
    private Niveau niveau;
}
