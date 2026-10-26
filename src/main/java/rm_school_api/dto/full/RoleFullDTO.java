package rm_school_api.dto.full;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.PrivilegeBasicDTO;
import rm_school_api.dto.basic.RoleBasicDTO;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class RoleFullDTO extends RoleBasicDTO {
    @Builder.Default
    private Set<PrivilegeBasicDTO> privileges = new HashSet<>();
}
