package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

@Entity
@Table(name = "INSCRIPTION")
@AttributeOverride(name = "id", column = @Column(name = "ID_INSCRIPTION"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Inscription extends AbstractEntity {

    @Column(name = "REDOUBLANT")
    private Boolean redoublant;

    @Column(name = "PHOTO", columnDefinition = "TEXT")
    private String photo;

    @NotNull(message = "l'élève est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ELEVE", nullable = false)
    private Eleve eleve;

    @NotNull(message = "la classe est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CLASSE", nullable = false)
    private Classe classe;
}
