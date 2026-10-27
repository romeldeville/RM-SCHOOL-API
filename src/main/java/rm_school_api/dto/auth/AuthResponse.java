package rm_school_api.dto.auth;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record AuthResponse(
        String accessToken,
        String tokenType,
        Long userId,
        String login,
        String role,
        String roleName
) {
    public static AuthResponse bearer(String accessToken, Long userId, String login, String role, String roleName) {
        return new AuthResponse(accessToken, "Bearer", userId, login, role, roleName);
    }
}
