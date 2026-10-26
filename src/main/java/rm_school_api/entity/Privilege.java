package rm_school_api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRIVILEGE")
@AttributeOverride(name = "id", column = @Column(name = "ID_PRIVILEGE"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Privilege extends AbstractEntity {

    @NotBlank(message = "le nom ne doit pas être vide")
    @Size(max = 100, message = "le nom ne doit pas dépasser 100 caractères")
    @Column(name = "NOM", nullable = false, length = 100)
    private String nom;

    @NotBlank(message = "le nom en anglais ne doit pas être vide")
    @Size(max = 100, message = "le nom en anglais ne doit pas dépasser 100 caractères")
    @Column(name = "NOM_ANGLAIS", nullable = false, length = 100)
    private String nomAnglais;

    @Size(max = 500, message = "la description ne doit pas dépasser 500 caractères")
    @Column(name = "DESCRIPTION", length = 500)
    private String description;

    @Size(max = 500, message = "la description en anglais ne doit pas dépasser 500 caractères")
    @Column(name = "DESCRIPTION_ANGLAIS", length = 500)
    private String descriptionAnglais;

    @Column(name = "STATUT")
    private Boolean statut;

    @JsonIgnore
    @Builder.Default
    @ManyToMany(mappedBy = "privileges", fetch = FetchType.LAZY)
    private Set<Role> roles = new HashSet<>();
}
