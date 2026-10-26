package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "ETABLISSEMENT_SCOLAIRE")
@AttributeOverride(name = "id", column = @Column(name = "ID_ETABLISSEMENT_SCOLAIRE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class EtablissementScolaire extends AbstractEntity {

    @NotBlank(message = "l'immatriculation ne doit pas être vide")
    @Size(max = 50, message = "l'immatriculation ne doit pas dépasser 50 caractères")
    @Column(name = "IMMATRICULATION", nullable = false, length = 50)
    private String immatriculation;

    @PastOrPresent(message = "la date de création ne peut pas être dans le futur")
    @Column(name = "DATE_CREATION")
    private LocalDate dateCreation;

    @Column(name = "DATE_OUVERTURE")
    private LocalDate dateOuverture;

    @Size(max = 100, message = "le nom du fondateur ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_FONDATEUR", length = 100)
    private String nomFondateur;

    @Size(max = 30, message = "le contact du fondateur ne doit pas dépasser 30 caractères")
    @Column(name = "CONTACT_FONDATEUR", length = 30)
    private String contactFondateur;
}
