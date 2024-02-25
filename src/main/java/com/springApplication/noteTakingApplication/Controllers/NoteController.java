package com.springApplication.noteTakingApplication.Controllers;

import com.springApplication.noteTakingApplication.Models.Note;
import com.springApplication.noteTakingApplication.Services.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {
    private NoteService noteService;
    @GetMapping
    public List<Note> getAllNotes(){
        return noteService.getAllnotes();
    }
    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id){
        return noteService.getNoteById(id);
    }
    @PostMapping
    public Note saveNote(@RequestBody Note note){
        return noteService.savenote(note);
    }
    @PutMapping("/{id}")
    public Note editNoteById(@PathVariable String id){
        return noteService.editNote(id);
    }
    @DeleteMapping("/{id}")
    public Note deleteNoteById(@PathVariable String id){
        return noteService.deleteNote(id);
    }
}
