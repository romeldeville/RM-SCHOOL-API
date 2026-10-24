package rm_school_api.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class EtablissementScolaire extends AbstractEntity {
    private String immatriculation;
    private LocalDate dateCreation;
    private LocalDate dateOuverture;
    private String nomFondateur;
    private String contactFondateur;
}
