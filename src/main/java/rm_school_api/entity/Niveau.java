package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.math.BigDecimal;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NIVEAU")
@AttributeOverride(name = "id", column = @Column(name = "ID_NIVEAU"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Niveau extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 100, message = "le nom ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @PositiveOrZero(message = "l'âge minimal admis doit être positif ou nul")
    @Column(name = "AGE_MINIMAL_ADMIS")
    private Integer ageMinimalAdmis;

    @PositiveOrZero(message = "l'âge maximal admis doit être positif ou nul")
    @Column(name = "AGE_MAXIMAL_ADMIS")
    private Integer ageMaximalAdmis;

    @PositiveOrZero(message = "la moyenne admise doit être positive ou nulle")
    @Column(name = "MOYENNE_ADMISE", precision = 15, scale = 2)
    private BigDecimal moyenneAdmise;

    @PositiveOrZero(message = "la moyenne de passage doit être positive ou nulle")
    @Column(name = "MOYENNE_PASSAGE", precision = 15, scale = 2)
    private BigDecimal moyennePassage;

    @NotNull(message = "le cycle est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CYCLE", nullable = false)
    private Cycle cycle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PENSION")
    private Pension pension;

    @Builder.Default
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "EXAMEN_NIVEAU",
            joinColumns = @JoinColumn(name = "ID_NIVEAU"),
            inverseJoinColumns = @JoinColumn(name = "ID_EXAMEN")
    )
    private Set<Examen> examens = new HashSet<>();
}
