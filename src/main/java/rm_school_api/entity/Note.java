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

@Entity
@Table(name = "NOTE")
@AttributeOverride(name = "id", column = @Column(name = "ID_NOTE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Note extends AbstractEntity {

    @PositiveOrZero(message = "la première évaluation doit être positive ou nulle")
    @Column(name = "PREMIERE_EVALUATION", precision = 15, scale = 2)
    private Double premiereEvaluation;

    @PositiveOrZero(message = "la deuxième évaluation doit être positive ou nulle")
    @Column(name = "DEUXIEME_EVALUATION", precision = 15, scale = 2)
    private Double deuxiemeEvaluation;

    @PositiveOrZero(message = "la troisième évaluation doit être positive ou nulle")
    @Column(name = "TROISIEME_EVALUATION", precision = 15, scale = 2)
    private Double troisiemeEvaluation;

    @PositiveOrZero(message = "la quatrième évaluation doit être positive ou nulle")
    @Column(name = "QUATRIEME_EVALUATION", precision = 15, scale = 2)
    private Double quatriemeEvaluation;

    @PositiveOrZero(message = "la cinquième évaluation doit être positive ou nulle")
    @Column(name = "CINQUIEME_EVALUATION", precision = 15, scale = 2)
    private Double cinquiemeEvaluation;

    @PositiveOrZero(message = "la sixième évaluation doit être positive ou nulle")
    @Column(name = "SIXIEME_EVALUATION", precision = 15, scale = 2)
    private Double sixiemeEvaluation;

    @PositiveOrZero(message = "la septième évaluation doit être positive ou nulle")
    @Column(name = "SEPTIEME_EVALUATION", precision = 15, scale = 2)
    private Double septiemeEvaluation;

    @PositiveOrZero(message = "la huitième évaluation doit être positive ou nulle")
    @Column(name = "HUITIEME_EVALUATION", precision = 15, scale = 2)
    private Double huitiemeEvaluation;

    @PositiveOrZero(message = "la neuvième évaluation doit être positive ou nulle")
    @Column(name = "NEUVIEME_EVALUATION", precision = 15, scale = 2)
    private Double neuviemeEvaluation;

    @NotNull(message = "l'inscription est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INSCRIPTION", nullable = false)
    private Inscription inscription;

    @NotNull(message = "le cours de l'enseignant est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_COURS_ENSEIGNANT", nullable = false)
    private CoursEnseignant coursEnseignant;
}
