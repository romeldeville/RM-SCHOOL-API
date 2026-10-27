package rm_school_api.dto.auth;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterRequest(
        @NotBlank(message = "Le login est obligatoire")
        String login,
        @NotBlank(message = "Le mot de passe est obligatoire")
        String motPasse,
        @NotNull(message = "Le rôle est obligatoire")
        Long roleId,
        @NotNull(message = "Le statut du compte est obligatoire")
        Long statutCompteUtilisateurId
) {
}
