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
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "PARAMETRE")
@AttributeOverride(name = "id", column = @Column(name = "ID_PARAMETRE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Parametre extends AbstractEntity {

    @PositiveOrZero(message = "le nombre d'évaluations trimestrielles doit être positif ou nul")
    @Column(name = "NOMBRE_EVALUATIONS_TRIMESTRIELLES")
    private Integer nombreEvaluationsTrimestrielles;

    @Size(max = 50, message = "le suffixe d'en-tête des documents ne doit pas dépasser 50 caractères")
    @Column(name = "SURFIXE_ENTETE_DOCUMENT", length = 50)
    private String surfixeEnteteDocument;

    @Column(name = "DATE_RENTREE_SCOLAIRE")
    private LocalDate dateRentreeScolaire;

    @NotNull(message = "les informations de l'établissement sont obligatoires")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INFORMATIONS_ETABLISSEMENT_SCOLAIRE", nullable = false)
    private InformationsEtablissementScolaire informationsEtablissementScolaire;
}
