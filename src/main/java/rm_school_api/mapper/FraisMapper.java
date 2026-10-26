package rm_school_api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import rm_school_api.dto.basic.FraisBasicDTO;
import rm_school_api.dto.basic.PensionBasicDTO;
import rm_school_api.dto.full.FraisFullDTO;
import rm_school_api.entity.Frais;
import rm_school_api.entity.Pension;

@Mapper(componentModel = "spring")
public interface FraisMapper extends AbstractMapper<Frais, FraisBasicDTO, FraisFullDTO> {
    @Mapping(source = "pension.id", target = "pensionId")
    FraisBasicDTO toBasicDTO(Frais entity);

    @Mapping(source = "pension.id", target = "pensionId")
    FraisFullDTO toFullDTO(Frais entity);

    @Mapping(target = "pension", ignore = true)
    Frais toEntity(FraisBasicDTO dto);

    Frais toEntity(FraisFullDTO dto);

    PensionBasicDTO toBasicDTO(Pension entity);

    Pension toEntity(PensionBasicDTO dto);
}
