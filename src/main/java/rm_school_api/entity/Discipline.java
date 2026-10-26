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
@Table(name = "DISCIPLINE")
@AttributeOverride(name = "id", column = @Column(name = "ID_DISCIPLINE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Discipline extends AbstractEntity {

    @PositiveOrZero(message = "le nombre de retards du trimestre 1 doit être positif ou nul")
    @Column(name = "RETARDS_TRIMESTRE1")
    private Integer retardsTrimestre1;

    @PositiveOrZero(message = "le nombre de retards du trimestre 2 doit être positif ou nul")
    @Column(name = "RETARDS_TRIMESTRE2")
    private Integer retardsTrimestre2;

    @PositiveOrZero(message = "le nombre de retards du trimestre 3 doit être positif ou nul")
    @Column(name = "RETARDS_TRIMESTRE3")
    private Integer retardsTrimestre3;

    @PositiveOrZero(message = "le nombre d'absences non justifiées du trimestre 1 doit être positif ou nul")
    @Column(name = "ABSENCES_NON_JUSTIFIEES_TRIMESTRE1")
    private Integer absencesNonJustifieesTrimestre1;

    @PositiveOrZero(message = "le nombre d'absences non justifiées du trimestre 2 doit être positif ou nul")
    @Column(name = "ABSENCES_NON_JUSTIFIEES_TRIMESTRE2")
    private Integer absencesNonJustifieesTrimestre2;

    @PositiveOrZero(message = "le nombre d'absences non justifiées du trimestre 3 doit être positif ou nul")
    @Column(name = "ABSENCES_NON_JUSTIFIEES_TRIMESTRE3")
    private Integer absencesNonJustifieesTrimestre3;

    @PositiveOrZero(message = "le nombre d'absences justifiées du trimestre 1 doit être positif ou nul")
    @Column(name = "ABSENCES_JUSTIFIEES_TRIMESTRE1")
    private Integer absencesJustifieesTrimestre1;

    @PositiveOrZero(message = "le nombre d'absences justifiées du trimestre 2 doit être positif ou nul")
    @Column(name = "ABSENCES_JUSTIFIEES_TRIMESTRE2")
    private Integer absencesJustifieesTrimestre2;

    @PositiveOrZero(message = "le nombre d'absences justifiées du trimestre 3 doit être positif ou nul")
    @Column(name = "ABSENCES_JUSTIFIEES_TRIMESTRE3")
    private Integer absencesJustifieesTrimestre3;

    @PositiveOrZero(message = "le nombre de blâmes du trimestre 1 doit être positif ou nul")
    @Column(name = "BLAMES_TRIMESTRE1")
    private Integer blamesTrimestre1;

    @PositiveOrZero(message = "le nombre de blâmes du trimestre 2 doit être positif ou nul")
    @Column(name = "BLAMES_TRIMESTRE2")
    private Integer blamesTrimestre2;

    @PositiveOrZero(message = "le nombre de blâmes du trimestre 3 doit être positif ou nul")
    @Column(name = "BLAMES_TRIMESTRE3")
    private Integer blamesTrimestre3;

    @PositiveOrZero(message = "le nombre d'exclusions du trimestre 1 doit être positif ou nul")
    @Column(name = "EXCLUSIONS_TRIMESTRE1")
    private Integer exclusionsTrimestre1;

    @PositiveOrZero(message = "le nombre d'exclusions du trimestre 2 doit être positif ou nul")
    @Column(name = "EXCLUSIONS_TRIMESTRE2")
    private Integer exclusionsTrimestre2;

    @PositiveOrZero(message = "le nombre d'exclusions du trimestre 3 doit être positif ou nul")
    @Column(name = "EXCLUSIONS_TRIMESTRE3")
    private Integer exclusionsTrimestre3;

    @PositiveOrZero(message = "le nombre d'avertissements du trimestre 1 doit être positif ou nul")
    @Column(name = "AVERTISSEMENTS_TRIMESTRE1")
    private Integer avertissementsTrimestre1;

    @PositiveOrZero(message = "le nombre d'avertissements du trimestre 2 doit être positif ou nul")
    @Column(name = "AVERTISSEMENTS_TRIMESTRE2")
    private Integer avertissementsTrimestre2;

    @PositiveOrZero(message = "le nombre d'avertissements du trimestre 3 doit être positif ou nul")
    @Column(name = "AVERTISSEMENTS_TRIMESTRE3")
    private Integer avertissementsTrimestre3;

    @PositiveOrZero(message = "le nombre de retenues du trimestre 1 doit être positif ou nul")
    @Column(name = "RETENUES_TRIMESTRE1")
    private Integer retenuesTrimestre1;

    @PositiveOrZero(message = "le nombre de retenues du trimestre 2 doit être positif ou nul")
    @Column(name = "RETENUES_TRIMESTRE2")
    private Integer retenuesTrimestre2;

    @PositiveOrZero(message = "le nombre de retenues du trimestre 3 doit être positif ou nul")
    @Column(name = "RETENUES_TRIMESTRE3")
    private Integer retenuesTrimestre3;

    @NotNull(message = "l'inscription est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INSCRIPTION", nullable = false)
    private Inscription inscription;
}
