package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.JourSemaineBasicDTO;
import rm_school_api.dto.full.JourSemaineFullDTO;
import rm_school_api.entity.JourSemaine;

@Mapper(componentModel = "spring")
public interface JourSemaineMapper {
    JourSemaineBasicDTO toBasicDTO(JourSemaine entity);

    JourSemaineFullDTO toFullDTO(JourSemaine entity);

    JourSemaine toEntity(JourSemaineBasicDTO dto);

    JourSemaine toEntity(JourSemaineFullDTO dto);
}
