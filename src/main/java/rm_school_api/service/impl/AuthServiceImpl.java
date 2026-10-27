package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rm_school_api.dto.auth.AuthResponse;
import rm_school_api.dto.auth.LoginRequest;
import rm_school_api.dto.auth.RegisterRequest;
import rm_school_api.entity.CompteUtilisateur;
import rm_school_api.entity.Role;
import rm_school_api.entity.StatutCompteUtilisateur;
import rm_school_api.exceptions.ResourceNotFoundException;
import rm_school_api.repository.CompteUtilisateurRepository;
import rm_school_api.repository.RoleRepository;
import rm_school_api.repository.StatutCompteUtilisateurRepository;
import rm_school_api.security.JwtTokenProvider;
import rm_school_api.security.UserPrincipal;
import rm_school_api.service.AuthService;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final CompteUtilisateurRepository compteUtilisateurRepository;
    private final RoleRepository roleRepository;
    private final StatutCompteUtilisateurRepository statutCompteUtilisateurRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public AuthResponse login(LoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.login(), request.motPasse())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        String token = jwtTokenProvider.generateToken(userPrincipal);
        String roleName = userPrincipal.getRole();
        return AuthResponse.bearer(token, userPrincipal.getId(), userPrincipal.getUsername(), roleName, roleName.replace("ROLE_", ""));
    }

    @Override
    @Transactional
    public AuthResponse register(RegisterRequest request) {
        if (compteUtilisateurRepository.existsByLogin(request.login())) {
            throw new IllegalArgumentException("Ce login est déjà utilisé.");
        }
        Role role = roleRepository.findById(request.roleId())
                .orElseThrow(() -> new ResourceNotFoundException("Rôle introuvable"));
        StatutCompteUtilisateur statut = statutCompteUtilisateurRepository.findById(request.statutCompteUtilisateurId())
                .orElseThrow(() -> new ResourceNotFoundException("Statut de compte introuvable"));

        CompteUtilisateur compte = new CompteUtilisateur();
        compte.setLogin(request.login());
        compte.setMotPasse(passwordEncoder.encode(request.motPasse()));
        compte.setRole(role);
        compte.setStatutCompteUtilisateur(statut);

        CompteUtilisateur saved = compteUtilisateurRepository.save(compte);
        UserPrincipal principal = new UserPrincipal(saved);
        String token = jwtTokenProvider.generateToken(principal);
        String roleName = principal.getRole();
        return AuthResponse.bearer(token, saved.getId(), saved.getLogin(), roleName, roleName.replace("ROLE_", ""));
    }

    @Override
    @Transactional(readOnly = true)
    public AuthResponse me() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !(authentication.getPrincipal() instanceof UserPrincipal userPrincipal)) {
            throw new IllegalArgumentException("Non authentifié");
        }
        String roleName = userPrincipal.getRole();
        return new AuthResponse(null, "Bearer", userPrincipal.getId(), userPrincipal.getUsername(), roleName, roleName.replace("ROLE_", ""));
    }
}
