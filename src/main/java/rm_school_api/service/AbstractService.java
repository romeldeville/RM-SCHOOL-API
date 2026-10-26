package rm_school_api.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface AbstractService<B, F extends B> {
    F create(F dto);
    List<B> createAll(List<F> dtos);
    F update(Long id, F dto);
    F findById(Long id);
    List<B> findAll();
    Page<B> findAll(Pageable pageable);
    List<B> findAll(Sort sort);
    List<B> findAllByIds(Iterable<Long> ids);
    boolean existsById(Long id);
    long count();
    void deleteById(Long id);
    void deleteAllById(Iterable<Long> ids);
    void deleteAll();
}
