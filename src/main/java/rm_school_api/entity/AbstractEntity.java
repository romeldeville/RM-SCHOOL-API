package rm_school_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDateTime;
import java.time.ZoneId;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    protected Long id;

    @Column(name = "DATE_ENREGISTREMENT", updatable = false)
    @NotNull(message = "la date d'enregistrement ne doit pas être null")
    protected LocalDateTime dateEnregistrement;

    @Column(name = "DATE_MODIFICATION")
    @NotNull(message = "la date de modification ne doit pas être null")
    protected LocalDateTime dateModification;

    @Column(name = "RESPONSABLE_ENREGISTREMENT", updatable = false)
    @NotNull(message = "le responsable de l'enregistrement ne doit pas être null")
    protected Long responsableEnregistrement;

    @Column(name = "RESPONSABLE_MODIFICATION")
    @NotNull(message = "le responsable de la modification ne doit pas être null")
    protected Long responsableModification;

    @PrePersist
    protected void prePersist() {
        this.dateEnregistrement = LocalDateTime.now(ZoneId.of("UTC"));
        this.dateModification = LocalDateTime.now(ZoneId.of("UTC"));
        this.responsableEnregistrement = 0L;
        this.responsableModification = 0L;
    }

    @PreUpdate
    protected void preUpdate() {
        this.dateModification = LocalDateTime.now(ZoneId.of("UTC"));
        this.responsableModification = 0L;
    }
}
