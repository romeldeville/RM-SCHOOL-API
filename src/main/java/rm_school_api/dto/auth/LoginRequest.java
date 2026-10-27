package rm_school_api.dto.auth;

import jakarta.validation.constraints.NotBlank;

public record LoginRequest(
        @NotBlank(message = "Le login est obligatoire")
        String login,
        @NotBlank(message = "Le mot de passe est obligatoire")
        String motPasse
) {
}
