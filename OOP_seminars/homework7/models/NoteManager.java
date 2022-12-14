package models;

import java.util.List;

public interface NoteManager {
    List<Note> getAllNotes();

    public void addNote(Note note);

    public void updateNote(Integer id, String title, String text) throws Exception;

    public Note readNote(Integer id) throws Exception;

    public void deleteNote(Integer Id) throws Exception;
}
