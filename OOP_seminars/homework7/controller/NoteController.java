package controller;

import java.util.List;

import models.Note;
import models.NoteManager;

public class NoteController {
    private NoteManager noteManager;

    public NoteController(NoteManager noteManager) {
        this.noteManager = noteManager;
    }

    public void addNote(Note note) {
        noteManager.addNote(note);
    }

    public Note readNote(Integer id) throws Exception {
        return noteManager.readNote(id);
    }

    public List<Note> readAllNotes() {
        return noteManager.getAllNotes();
    }

    public void deleteNote(Integer id) throws Exception {
        noteManager.deleteNote(id);
    }

    public void updateNote(Integer id, String title, String text) throws Exception {
        noteManager.updateNote(id, title, text);
    }

}
