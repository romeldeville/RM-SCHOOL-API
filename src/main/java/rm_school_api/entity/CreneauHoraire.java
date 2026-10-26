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

import java.time.LocalTime;

@Entity
@Table(name = "CRENEAU_HORAIRE")
@AttributeOverride(name = "id", column = @Column(name = "ID_CRENEAU_HORAIRE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CreneauHoraire extends AbstractEntity {

    @Column(name = "HEURE_DEBUT")
    private LocalTime heureDebut;

    @Column(name = "HEURE_FIN")
    private LocalTime heureFin;

    @PositiveOrZero(message = "l'ordre doit être positif ou nul")
    @Column(name = "ORDRE")
    private Integer ordre;

    @NotNull(message = "le type de créneau est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TYPE_CRENEAU", nullable = false)
    private TypeCreneau typeCreneau;
}
