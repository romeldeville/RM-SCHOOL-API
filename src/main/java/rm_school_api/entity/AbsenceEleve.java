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

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "ABSENCE_ELEVE")
@AttributeOverride(name = "id", column = @Column(name = "ID_ABSENCE_ELEVE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AbsenceEleve extends AbstractEntity {

    @Column(name = "DATE_APPEL")
    private LocalDate dateAppel;

    @Column(name = "HEURE_DEBUT")
    private LocalTime heureDebut;

    @Column(name = "HEURE_FIN")
    private LocalTime heureFin;

    @Size(max = 500, message = "le commentaire ne doit pas dépasser 500 caractères")
    @Column(name = "COMMENTAIRE", length = 500)
    private String commentaire;

    @Size(max = 500, message = "le justificatif ne doit pas dépasser 500 caractères")
    @Column(name = "JUSTIFICATIF", length = 500)
    private String justificatif;

    @Size(max = 500, message = "le chemin du document ne doit pas dépasser 500 caractères")
    @Column(name = "DOCUMENT_PATH", length = 500)
    private String documentPath;

    @Column(name = "VALIDE")
    private Boolean valide;

    @Column(name = "DATE_VALIDATION")
    private LocalDate dateValidation;

    @Column(name = "VALIDE_PAR")
    private Long validePar;

    @NotNull(message = "l'inscription est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INSCRIPTION", nullable = false)
    private Inscription inscription;
}
