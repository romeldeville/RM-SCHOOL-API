package rm_school_api.service;

import rm_school_api.dto.auth.AuthResponse;
import rm_school_api.dto.auth.LoginRequest;
import rm_school_api.dto.auth.RegisterRequest;

public interface AuthService {
    AuthResponse login(LoginRequest request);
    AuthResponse register(RegisterRequest request);
    AuthResponse me();
}
