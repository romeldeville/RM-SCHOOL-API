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
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "INFORMATIONS_PERSONNEL")
@AttributeOverride(name = "id", column = @Column(name = "ID_INFORMATIONS_PERSONNEL"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InformationsPersonnel extends AbstractEntity {

    @NotBlank(message = "le matricule ne doit pas être vide")
    @Size(max = 50, message = "le matricule ne doit pas dépasser 50 caractères")
    @Column(name = "MATRICULE", nullable = false, length = 50)
    private String matricule;

    @Size(max = 150, message = "le diplôme professionnel ne doit pas dépasser 150 caractères")
    @Column(name = "DIPLOME_PROFESSIONNEL", length = 150)
    private String diplomeProfessionnel;

    @Size(max = 150, message = "la discipline de formation ne doit pas dépasser 150 caractères")
    @Column(name = "DISCIPLINE_DE_FORMATION", length = 150)
    private String disciplineDeFormation;

    @Size(max = 100, message = "le grade ne doit pas dépasser 100 caractères")
    @Column(name = "GRADE", length = 100)
    private String grade;

    @Size(max = 100, message = "le poste occupé ne doit pas dépasser 100 caractères")
    @Column(name = "POSTE_OCCUPE", length = 100)
    private String posteOccupe;

    @Size(max = 50, message = "le statut ne doit pas dépasser 50 caractères")
    @Column(name = "STATUT", length = 50)
    private String statut;

    @Column(name = "DATE_ARRIVEE")
    private LocalDate dateArrivee;

    @Size(max = 100, message = "la référence de l'acte de recrutement ne doit pas dépasser 100 caractères")
    @Column(name = "REFERENCE_ACTE_RECRUTEMENT", length = 100)
    private String referenceActeRecrutement;

    @Size(max = 100, message = "la région d'origine ne doit pas dépasser 100 caractères")
    @Column(name = "REGION_ORIGINE", length = 100)
    private String regionOrigine;

    @Size(max = 100, message = "le département d'origine ne doit pas dépasser 100 caractères")
    @Column(name = "DEPARTEMENT_ORIGINE", length = 100)
    private String departementOrigine;

    @Size(max = 100, message = "l'arrondissement d'origine ne doit pas dépasser 100 caractères")
    @Column(name = "ARRONDISSEMENT_ORIGINE", length = 100)
    private String arrondissementOrigine;

    @Size(max = 50, message = "la situation matrimoniale ne doit pas dépasser 50 caractères")
    @Column(name = "SITUATION_MATRIMONIALE", length = 50)
    private String situationMatrimoniale;

    @Size(max = 100, message = "le nom du conjoint ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_CONJOINT", length = 100)
    private String nomConjoint;

    @Size(max = 100, message = "la profession du conjoint ne doit pas dépasser 100 caractères")
    @Column(name = "PROFESSION_CONJOINT", length = 100)
    private String professionConjoint;

    @Size(max = 150, message = "le diplôme académique ne doit pas dépasser 150 caractères")
    @Column(name = "DIPLOME_ACADEMIQUE", length = 150)
    private String diplomeAcademique;

    @PositiveOrZero(message = "le quota horaire doit être positif ou nul")
    @Column(name = "QUOTA_HORAIRE", precision = 15, scale = 2)
    private Double quotaHoraire;

    @Column(name = "DATE_ENTREE_FONCTION_PUBLIQUE")
    private LocalDate dateEntreeFonctionPublique;

    @PositiveOrZero(message = "l'indice de solde doit être positif ou nul")
    @Column(name = "INDICE_SOLDE")
    private Integer indiceSolde;

    @PositiveOrZero(message = "l'indice de carrière doit être positif ou nul")
    @Column(name = "INDICE_CARRIERE")
    private Integer indiceCarriere;

    @PositiveOrZero(message = "l'échelon doit être positif ou nul")
    @Column(name = "ECHELON")
    private Integer echelon;

    @Size(max = 50, message = "la catégorie ne doit pas dépasser 50 caractères")
    @Column(name = "CATEGORIE", length = 50)
    private String categorie;

    @Size(max = 50, message = "le corps ne doit pas dépasser 50 caractères")
    @Column(name = "CORPS", length = 50)
    private String corps;

    @Column(name = "DATE_PROMOTION")
    private LocalDate datePromotion;

    @Size(max = 100, message = "la référence du texte de nomination ne doit pas dépasser 100 caractères")
    @Column(name = "REFERENCE_TEXTE_NOMINATION", length = 100)
    private String referenceTexteNomination;

    @Size(max = 150, message = "le champ 'venant de' ne doit pas dépasser 150 caractères")
    @Column(name = "VENANT_DE", length = 150)
    private String venantDe;

    @Size(max = 50, message = "le rang du poste ne doit pas dépasser 50 caractères")
    @Column(name = "RANG_DU_POSTE", length = 50)
    private String rangDuPoste;

    @Size(max = 100, message = "la situation indemnitaire ne doit pas dépasser 100 caractères")
    @Column(name = "SITUATION_INDEMNITAIRE", length = 100)
    private String situationIndemnitaire;

    @Column(name = "DATE_DERNIER_AVANCEMENT")
    private LocalDate dateDernierAvancement;

    @Size(max = 100, message = "la position actuelle ne doit pas dépasser 100 caractères")
    @Column(name = "POSITION_ACTUELLE", length = 100)
    private String positionActuelle;

    @NotNull(message = "le personnel est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PERSONNEL", nullable = false)
    private Personnel personnel;

    @NotNull(message = "les informations de l'établissement sont obligatoires")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INFORMATIONS_ETABLISSEMENT_SCOLAIRE", nullable = false)
    private InformationsEtablissementScolaire informationsEtablissementScolaire;
}
