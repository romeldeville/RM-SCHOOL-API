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
@Table(name = "ABSENCE_PERSONNEL")
@AttributeOverride(name = "id", column = @Column(name = "ID_ABSENCE_PERSONNEL"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class AbsencePersonnel extends AbstractEntity {

    @Column(name = "DATE_ABSENCE")
    private LocalDate dateAbsence;

    @Column(name = "HEURE_DEBUT")
    private LocalTime heureDebut;

    @Column(name = "HEURE_FIN")
    private LocalTime heureFin;

    @Size(max = 255, message = "le motif ne doit pas dépasser 255 caractères")
    @Column(name = "MOTIF", length = 255)
    private String motif;

    @Size(max = 100, message = "le type d'absence ne doit pas dépasser 100 caractères")
    @Column(name = "TYPE_ABSENCE", length = 100)
    private String typeAbsence;

    @Size(max = 500, message = "le commentaire ne doit pas dépasser 500 caractères")
    @Column(name = "COMMENTAIRE", length = 500)
    private String commentaire;

    @Size(max = 500, message = "le chemin du document ne doit pas dépasser 500 caractères")
    @Column(name = "DOCUMENT_PATH", length = 500)
    private String documentPath;

    @Column(name = "APPROUVE")
    private Boolean approuve;

    @Column(name = "DATE_APPROBATION")
    private LocalDate dateApprobation;

    @Column(name = "APPROUVE_PAR")
    private Long approuvePar;

    @NotNull(message = "les informations du personnel sont obligatoires")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INFORMATIONS_PERSONNEL", nullable = false)
    private InformationsPersonnel informationsPersonnel;
}
