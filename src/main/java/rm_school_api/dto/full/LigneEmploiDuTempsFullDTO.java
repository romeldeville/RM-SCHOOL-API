package rm_school_api.dto.full;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;
import rm_school_api.dto.basic.CoursEnseignantBasicDTO;
import rm_school_api.dto.basic.CreneauHoraireBasicDTO;
import rm_school_api.dto.basic.JourSemaineBasicDTO;
import rm_school_api.dto.basic.LigneEmploiDuTempsBasicDTO;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class LigneEmploiDuTempsFullDTO extends LigneEmploiDuTempsBasicDTO {
    private JourSemaineBasicDTO jourSemaine;
    private CreneauHoraireBasicDTO creneauHoraire;
    private CoursEnseignantBasicDTO coursEnseignant;
}
