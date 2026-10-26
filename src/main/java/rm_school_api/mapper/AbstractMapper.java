package rm_school_api.mapper;

public interface AbstractMapper<E, B, F extends B> {
    B toBasicDTO(E entity);
    F toFullDTO(E entity);
    E toEntity(F dto);
}
