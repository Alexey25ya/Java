package Homework6.models;

import java.util.List;

public interface NoteManager {
    List<Note> getAllNotes();

    public void addNote(Note note);

}
