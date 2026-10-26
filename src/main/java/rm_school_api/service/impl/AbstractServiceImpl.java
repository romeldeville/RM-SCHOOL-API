package rm_school_api.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import rm_school_api.entity.AbstractEntity;
import rm_school_api.exceptions.ResourceNotFoundException;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.service.AbstractService;

import java.util.List;

public abstract class AbstractServiceImpl<E extends AbstractEntity, B, F extends B> implements AbstractService<B, F> {

    protected abstract JpaRepository<E, Long> getRepository();

    protected abstract AbstractMapper<E, B, F> getMapper();

    @Override
    @Transactional
    public F create(F dto) {
        AbstractMapper<E, B, F> mapper = getMapper();
        E entity = mapper.toEntity(dto);
        entity.setId(null);
        return mapper.toFullDTO(getRepository().save(entity));
    }

    @Override
    @Transactional
    public List<B> createAll(List<F> dtos) {
        AbstractMapper<E, B, F> mapper = getMapper();
        List<E> entities = dtos.stream()
                .map(dto -> {
                    E entity = mapper.toEntity(dto);
                    entity.setId(null);
                    return entity;
                })
                .toList();
        return getRepository().saveAll(entities).stream()
                .map(mapper::toBasicDTO)
                .toList();
    }

    @Override
    @Transactional
    public F update(Long id, F dto) {
        E existing = getEntity(id);
        AbstractMapper<E, B, F> mapper = getMapper();
        E entity = mapper.toEntity(dto);
        entity.setId(id);
        entity.setDateEnregistrement(existing.getDateEnregistrement());
        entity.setResponsableEnregistrement(existing.getResponsableEnregistrement());
        return mapper.toFullDTO(getRepository().save(entity));
    }

    @Override
    @Transactional(readOnly = true)
    public F findById(Long id) {
        return getMapper().toFullDTO(getEntity(id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<B> findAll() {
        AbstractMapper<E, B, F> mapper = getMapper();
        return getRepository().findAll().stream()
                .map(mapper::toBasicDTO)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<B> findAll(Pageable pageable) {
        return getRepository().findAll(pageable).map(getMapper()::toBasicDTO);
    }

    @Override
    @Transactional(readOnly = true)
    public List<B> findAll(Sort sort) {
        AbstractMapper<E, B, F> mapper = getMapper();
        return getRepository().findAll(sort).stream()
                .map(mapper::toBasicDTO)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<B> findAllByIds(Iterable<Long> ids) {
        AbstractMapper<E, B, F> mapper = getMapper();
        return getRepository().findAllById(ids).stream()
                .map(mapper::toBasicDTO)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsById(Long id) {
        return getRepository().existsById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return getRepository().count();
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (!getRepository().existsById(id)) {
            throw notFound(id);
        }
        getRepository().deleteById(id);
    }

    @Override
    @Transactional
    public void deleteAllById(Iterable<Long> ids) {
        getRepository().deleteAllById(ids);
    }

    @Override
    @Transactional
    public void deleteAll() {
        getRepository().deleteAll();
    }

    protected E getEntity(Long id) {
        return getRepository().findById(id)
                .orElseThrow(() -> notFound(id));
    }

    protected ResourceNotFoundException notFound(Long id) {
        return new ResourceNotFoundException("Entité introuvable avec l'id : " + id);
    }
}
