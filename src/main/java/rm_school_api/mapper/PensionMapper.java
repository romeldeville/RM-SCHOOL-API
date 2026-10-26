package rm_school_api.mapper;

import org.mapstruct.Mapper;
import rm_school_api.dto.basic.PensionBasicDTO;
import rm_school_api.dto.full.PensionFullDTO;
import rm_school_api.entity.Pension;

@Mapper(componentModel = "spring")
public interface PensionMapper extends AbstractMapper<Pension, PensionBasicDTO, PensionFullDTO> {
    PensionBasicDTO toBasicDTO(Pension entity);

    PensionFullDTO toFullDTO(Pension entity);

    Pension toEntity(PensionBasicDTO dto);

    Pension toEntity(PensionFullDTO dto);
}
