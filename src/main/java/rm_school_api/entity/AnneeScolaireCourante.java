package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "ANNEE_SCOLAIRE_COURANTE")
@AttributeOverride(name = "id", column = @Column(name = "ID_ANNEE_SCOLAIRE_COURANTE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AnneeScolaireCourante extends AbstractEntity {

    @NotNull(message = "l'année scolaire est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ANNEE_SCOLAIRE", nullable = false)
    private AnneeScolaire anneeScolaire;
}
