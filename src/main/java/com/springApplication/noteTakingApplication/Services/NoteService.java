package com.springApplication.noteTakingApplication.Services;

import com.springApplication.noteTakingApplication.Models.Note;

import java.util.List;

public interface NoteService {

    public List<Note> getAllnotes();

    public Note getNoteById(Long id);

    public Note savenote(Note note);

    public Note editNote(String id);

    public Note deleteNote(String id);
}
