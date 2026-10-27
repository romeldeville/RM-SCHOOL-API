package rm_school_api.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import rm_school_api.entity.CompteUtilisateur;

import java.util.Collection;
import java.util.List;

public class UserPrincipal implements UserDetails {

    private final Long id;
    private final String login;
    private final String motPasse;
    private final String role;
    private final boolean enabled;

    public UserPrincipal(CompteUtilisateur compteUtilisateur) {
        this.id = compteUtilisateur.getId();
        this.login = compteUtilisateur.getLogin();
        this.motPasse = compteUtilisateur.getMotPasse();
        String roleName = compteUtilisateur.getRole() != null ? compteUtilisateur.getRole().getNom() : "ROLE_USER";
        this.role = roleName.startsWith("ROLE_") ? roleName : "ROLE_" + roleName;
        this.enabled = compteUtilisateur.getStatutCompteUtilisateur() == null
                || !"INACTIF".equalsIgnoreCase(compteUtilisateur.getStatutCompteUtilisateur().getNom())
                && !"BLOQUE".equalsIgnoreCase(compteUtilisateur.getStatutCompteUtilisateur().getNom());
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getPassword() {
        return motPasse;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return enabled;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
