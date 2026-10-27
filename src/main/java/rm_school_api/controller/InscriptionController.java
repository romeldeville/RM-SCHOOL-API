package rm_school_api.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import rm_school_api.dto.basic.InscriptionBasicDTO;
import rm_school_api.dto.full.InscriptionFullDTO;
import rm_school_api.service.InscriptionService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/inscriptions")
@RequiredArgsConstructor
public class InscriptionController {

    private final InscriptionService service;

    @PostMapping
    public ResponseEntity<InscriptionFullDTO> create(@Valid @RequestBody InscriptionFullDTO dto) {
        InscriptionFullDTO created = service.create(dto);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(created.getId())
                .toUri();
        return ResponseEntity.created(location).body(created);
    }

    @PostMapping("/batch")
    public ResponseEntity<List<InscriptionBasicDTO>> createAll(@Valid @RequestBody List<@Valid InscriptionFullDTO> dtos) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createAll(dtos));
    }

    @PutMapping("/{id}")
    public InscriptionFullDTO update(@PathVariable Long id, @Valid @RequestBody InscriptionFullDTO dto) {
        return service.update(id, dto);
    }

    @GetMapping("/{id}")
    public InscriptionFullDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping
    public Page<InscriptionBasicDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/all")
    public List<InscriptionBasicDTO> findAll() {
        return service.findAll();
    }

    @GetMapping("/sorted")
    public List<InscriptionBasicDTO> findAllSorted(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/ids")
    public List<InscriptionBasicDTO> findAllByIds(@RequestParam List<Long> ids) {
        return service.findAllByIds(ids);
    }

    @GetMapping("/{id}/exists")
    public boolean existsById(@PathVariable Long id) {
        return service.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping("/batch")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAllById(@RequestParam List<Long> ids) {
        service.deleteAllById(ids);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
        service.deleteAll();
    }
}
