package rm_school_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class InformationsEtablissementScolaire extends AbstractEntity {
    @NotNull(message = "Pays de l'établissement est obligatoire")
    private String pays;

    @NotNull(message = "Pays anglais de l'établissement est obligatoire")
    private String paysAnglais;

    @NotNull(message = "")
    private String devisePays;
    private String devisePaysAnglais;
    private String ministere;
    private String ministereAnglais;
    private String region;
    private String regionAnglais;
    private String departement;
    private String departementAnglais;
    private String arrondissement;
    private String arrondissementAnglais;
    private String ville;
    private String villeAnglais;
    private String localisation;
    private String localisationAnglais;

    @NotNull(message = "Nom de l'établissement est obligatoire")
    private String nom;

    @NotNull(message = "Nom anglais de l'établissement est obligatoire")
    private String nomAnglais;
    private String abreviation;
    private String abreviationAnglais;
    private String devise;
    private String deviseAnglais;
    private String telephone;
    private String codePostal;
    private String fax;
    private String email;
    private String logo;

    @ManyToOne
    AnneeScolaire anneeScolaire;

    @ManyToOne
    EtablissementScolaire etablissementScolaire;
}
