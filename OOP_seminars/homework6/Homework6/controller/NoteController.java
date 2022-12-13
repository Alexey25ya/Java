package Homework6.controller;

import java.util.List;

import Homework6.models.Note;
import Homework6.models.NoteManager;

public class NoteController {
    private NoteManager noteManager;

    public NoteController(NoteManager noteManager) {
        this.noteManager = noteManager;
    }

    public void addNote(Note note) {
        noteManager.addNote(note);
    }

    public List<Note> readAllNotes() {
        return noteManager.getAllNotes();
    }

}
