package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "COMPETENCE")
@AttributeOverride(name = "id", column = @Column(name = "ID_COMPETENCE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Competence extends AbstractEntity {

    @Size(max = 500, message = "la compétence de la première évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_PREMIERE_EVALUATION", length = 500)
    private String competencePremiereEvaluation;

    @Size(max = 500, message = "la compétence de la deuxième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_DEUXIEME_EVALUATION", length = 500)
    private String competenceDeuxiemeEvaluation;

    @Size(max = 500, message = "la compétence de la troisième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_TROISIEME_EVALUATION", length = 500)
    private String competenceTroisiemeEvaluation;

    @Size(max = 500, message = "la compétence de la quatrième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_QUATRIEME_EVALUATION", length = 500)
    private String competenceQuatriemeEvaluation;

    @Size(max = 500, message = "la compétence de la cinquième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_CINQUIEME_EVALUATION", length = 500)
    private String competenceCinquiemeEvaluation;

    @Size(max = 500, message = "la compétence de la sixième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_SIXIEME_EVALUATION", length = 500)
    private String competenceSixiemeEvaluation;

    @Size(max = 500, message = "la compétence de la septième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_SEPTIEME_EVALUATION", length = 500)
    private String competenceSeptiemeEvaluation;

    @Size(max = 500, message = "la compétence de la huitième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_HUITIEME_EVALUATION", length = 500)
    private String competenceHuitiemeEvaluation;

    @Size(max = 500, message = "la compétence de la neuvième évaluation ne doit pas dépasser 500 caractères")
    @Column(name = "COMPETENCE_NEUVIEME_EVALUATION", length = 500)
    private String competenceNeuviemeEvaluation;

    @NotNull(message = "le cours du niveau est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_COUR_NIVEAU", nullable = false)
    private CourNiveau courNiveau;
}
