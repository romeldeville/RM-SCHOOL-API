package rm_school_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import rm_school_api.dto.basic.NoteBasicDTO;
import rm_school_api.dto.full.NoteFullDTO;
import rm_school_api.entity.Note;
import rm_school_api.mapper.AbstractMapper;
import rm_school_api.mapper.NoteMapper;
import rm_school_api.repository.NoteRepository;
import rm_school_api.service.NoteService;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl extends AbstractServiceImpl<Note, NoteBasicDTO, NoteFullDTO> implements NoteService {

    private final NoteRepository repository;
    private final NoteMapper mapper;

    @Override
    protected JpaRepository<Note, Long> getRepository() {
        return repository;
    }

    @Override
    protected AbstractMapper<Note, NoteBasicDTO, NoteFullDTO> getMapper() {
        return mapper;
    }
}
