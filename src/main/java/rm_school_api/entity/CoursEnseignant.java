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
@Table(name = "COURS_ENSEIGNANT")
@AttributeOverride(name = "id", column = @Column(name = "ID_COURS_ENSEIGNANT"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CoursEnseignant extends AbstractEntity {

    @NotNull(message = "le cours du niveau est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_COUR_NIVEAU", nullable = false)
    private CourNiveau courNiveau;

    @NotNull(message = "la classe est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CLASSE", nullable = false)
    private Classe classe;

    @NotNull(message = "les informations du personnel sont obligatoires")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INFORMATIONS_PERSONNEL", nullable = false)
    private InformationsPersonnel informationsPersonnel;
}
