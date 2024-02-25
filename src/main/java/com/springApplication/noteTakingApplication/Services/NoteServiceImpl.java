package com.springApplication.noteTakingApplication.Services;

import com.springApplication.noteTakingApplication.Entities.NoteEntity;
import com.springApplication.noteTakingApplication.Models.Note;
import com.springApplication.noteTakingApplication.Repositories.NoteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class NoteServiceImpl implements NoteService{
    @Autowired
    private NoteRepository noteRepository;
    @Override
    public List<Note> getAllnotes() {
        List<NoteEntity> noteEntities = (List<NoteEntity>) noteRepository.findAll();

        List<Note> notes = noteEntities.stream().map(noteEntity -> {
            Note note = new Note();
            BeanUtils.copyProperties(noteEntity,note);
            return note;
        }).collect(Collectors.toList());
        return notes;
    }

    @Override
    public Note getNoteById(Long id) {
        return null;
    }

    @Override
    public Note savenote(Note note) {
        if(note.getNoteID() == null || note.getNoteID().isEmpty()){
            note.setNoteID(UUID.randomUUID().toString());
        }
        NoteEntity noteEntity = new NoteEntity();
        BeanUtils.copyProperties(note,noteEntity);
        noteRepository.save(noteEntity);
        return note;
    }

    @Override
    public Note editNote(String id) {
        return null;
    }

    @Override
    public Note deleteNote(String id) {
        return null;
    }
}
