package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "INFORMATIONS_ETABLISSEMENT_SCOLAIRE")
@AttributeOverride(name = "id", column = @Column(name = "ID_INFORMATIONS_ETABLISSEMENT_SCOLAIRE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InformationsEtablissementScolaire extends AbstractEntity {

    @NotBlank(message = "le pays est obligatoire")
    @Size(max = 100, message = "le pays ne doit pas dépasser 100 caractères")
    @Column(name = "PAYS", nullable = false, length = 100)
    private String pays;

    @NotBlank(message = "le pays en anglais est obligatoire")
    @Size(max = 100, message = "le pays en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "PAYS_ANGLAIS", nullable = false, length = 100)
    private String paysAnglais;

    @NotBlank(message = "la devise du pays est obligatoire")
    @Size(max = 100, message = "la devise du pays ne doit pas dépasser 100 caractères")
    @Column(name = "DEVISE_PAYS", nullable = false, length = 100)
    private String devisePays;

    @NotBlank(message = "la devise du pays en anglais est obligatoire")
    @Size(max = 100, message = "la devise du pays en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "DEVISE_PAYS_ANGLAIS", nullable = false, length = 100)
    private String devisePaysAnglais;

    @Size(max = 150, message = "le ministère ne doit pas dépasser 150 caractères")
    @Column(name = "MINISTERE", length = 150)
    private String ministere;

    @Size(max = 150, message = "le ministère en anglais ne doit pas dépasser 150 caractères")
    @Column(name = "MINISTERE_ANGLAIS", length = 150)
    private String ministereAnglais;

    @Size(max = 100, message = "la région ne doit pas dépasser 100 caractères")
    @Column(name = "REGION", length = 100)
    private String region;

    @Size(max = 100, message = "la région en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "REGION_ANGLAIS", length = 100)
    private String regionAnglais;

    @Size(max = 100, message = "le département ne doit pas dépasser 100 caractères")
    @Column(name = "DEPARTEMENT", length = 100)
    private String departement;

    @Size(max = 100, message = "le département en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "DEPARTEMENT_ANGLAIS", length = 100)
    private String departementAnglais;

    @Size(max = 100, message = "l'arrondissement ne doit pas dépasser 100 caractères")
    @Column(name = "ARRONDISSEMENT", length = 100)
    private String arrondissement;

    @Size(max = 100, message = "l'arrondissement en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "ARRONDISSEMENT_ANGLAIS", length = 100)
    private String arrondissementAnglais;

    @Size(max = 100, message = "la ville ne doit pas dépasser 100 caractères")
    @Column(name = "VILLE", length = 100)
    private String ville;

    @Size(max = 100, message = "la ville en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "VILLE_ANGLAIS", length = 100)
    private String villeAnglais;

    @Size(max = 255, message = "la localisation ne doit pas dépasser 255 caractères")
    @Column(name = "LOCALISATION", length = 255)
    private String localisation;

    @Size(max = 255, message = "la localisation en anglais ne doit pas dépasser 255 caractères")
    @Column(name = "LOCALISATION_ANGLAIS", length = 255)
    private String localisationAnglais;

    @NotBlank(message = "le nom de l'établissement est obligatoire")
    @Size(max = 100, message = "le nom de l'établissement ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @NotBlank(message = "le nom en anglais de l'établissement est obligatoire")
    @Size(max = 100, message = "le nom en anglais de l'établissement ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_ANGLAIS", nullable = false, length = 100)
    private String nomAnglais;

    @Size(max = 20, message = "l'abréviation ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION", length = 20)
    private String abreviation;

    @Size(max = 20, message = "l'abréviation en anglais ne doit pas dépasser 20 caractères")
    @Column(name = "ABREVIATION_ANGLAIS", length = 20)
    private String abreviationAnglais;

    @Size(max = 100, message = "la devise ne doit pas dépasser 100 caractères")
    @Column(name = "DEVISE", length = 100)
    private String devise;

    @Size(max = 100, message = "la devise en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "DEVISE_ANGLAIS", length = 100)
    private String deviseAnglais;

    @Size(max = 30, message = "le téléphone ne doit pas dépasser 30 caractères")
    @Column(name = "TELEPHONE", length = 30)
    private String telephone;

    @Size(max = 20, message = "le code postal ne doit pas dépasser 20 caractères")
    @Column(name = "CODE_POSTAL", length = 20)
    private String codePostal;

    @Size(max = 30, message = "le fax ne doit pas dépasser 30 caractères")
    @Column(name = "FAX", length = 30)
    private String fax;

    @Email(message = "l'adresse email n'est pas valide")
    @Size(max = 150, message = "l'adresse email ne doit pas dépasser 150 caractères")
    @Column(name = "EMAIL", length = 150)
    private String email;

    @Column(name = "LOGO", columnDefinition = "TEXT")
    private String logo;

    @NotNull(message = "l'année scolaire est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ANNEE_SCOLAIRE", nullable = false)
    private AnneeScolaire anneeScolaire;

    @NotNull(message = "l'établissement scolaire est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ETABLISSEMENT_SCOLAIRE", nullable = false)
    private EtablissementScolaire etablissementScolaire;
}
