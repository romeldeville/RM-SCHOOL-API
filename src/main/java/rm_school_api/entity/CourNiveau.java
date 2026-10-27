package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.math.BigDecimal;

@Entity
@Table(name = "COUR_NIVEAU")
@AttributeOverride(name = "id", column = @Column(name = "ID_COUR_NIVEAU"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CourNiveau extends AbstractEntity {

    @PositiveOrZero(message = "le coefficient doit être positif ou nul")
    @Column(name = "COEFFICIENT", precision = 15, scale = 2)
    private BigDecimal coefficient;

    @PositiveOrZero(message = "le nombre d'heures hebdomadaires doit être positif ou nul")
    @Column(name = "NOMBRE_HEURES_HEBDO", precision = 15, scale = 2)
    private BigDecimal nombreHeuresHebdo;

    @NotNull(message = "le groupe est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_GROUPE", nullable = false)
    private Groupe groupe;

    @NotNull(message = "la matière est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_MATIERE", nullable = false)
    private Matiere matiere;

    @NotNull(message = "le niveau est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_NIVEAU", nullable = false)
    private Niveau niveau;
}
