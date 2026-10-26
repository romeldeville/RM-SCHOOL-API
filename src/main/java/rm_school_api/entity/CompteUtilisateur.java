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

@Entity
@Table(name = "COMPTE_UTILISATEUR")
@AttributeOverride(name = "id", column = @Column(name = "ID_COMPTE_UTILISATEUR"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CompteUtilisateur extends AbstractEntity {

    @NotBlank(message = "le login ne doit pas être vide")
    @Size(min = 3, max = 50, message = "le login doit contenir entre 3 et 50 caractères")
    @Column(name = "LOGIN", nullable = false, length = 50)
    private String login;

    @NotBlank(message = "le mot de passe ne doit pas être vide")
    @Size(min = 8, max = 255, message = "le mot de passe doit contenir entre 8 et 255 caractères")
    @Column(name = "MOT_PASSE", nullable = false, length = 255)
    private String motPasse;

    @NotNull(message = "le statut du compte utilisateur est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_STATUT_COMPTE_UTILISATEUR", nullable = false)
    private StatutCompteUtilisateur statutCompteUtilisateur;

    @NotNull(message = "le rôle est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ROLE", nullable = false)
    private Role role;
}
