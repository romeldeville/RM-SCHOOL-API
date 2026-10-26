package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "PERIODE")
@AttributeOverride(name = "id", column = @Column(name = "ID_PERIODE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Periode extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 100, message = "le nom ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @NotBlank(message = "le nom en anglais ne doit pas être vide")
    @Size(max = 100, message = "le nom en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_ANGLAIS", nullable = false, length = 100)
    private String nomAnglais;

    @Size(max = 20, message = "l'abréviation ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION", length = 20)
    private String abreviation;

    @Size(max = 20, message = "l'abréviation en anglais ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION_ANGLAIS", length = 20)
    private String abreviationAnglais;

    @Column(name = "DEBUT")
    private LocalDate debut;

    @Column(name = "FIN")
    private LocalDate fin;

    @Column(name = "STATUT")
    private Boolean statut;

    @NotNull(message = "l'année scolaire est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ANNEE_SCOLAIRE", nullable = false)
    private AnneeScolaire anneeScolaire;
}
