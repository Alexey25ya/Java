package models;

import java.util.ArrayList;
import java.util.List;

public class NoteManagerImpl implements NoteManager {

    private FileOperation fileOperation;

    private NoteMapper noteMapper = new NoteMapper();

    public NoteManagerImpl(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void addNote(Note note) {
        List<Note> notes = getAllNotes();
        int max = 0;
        for (Note item : notes) {
            int id = item.getId();
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        note.setId(newId);
        notes.add(note);
        saveNote(notes);
    }

    private void saveNote(List<Note> notes) {
        List<String> lines = new ArrayList<>();
        for (Note item : notes) {
            lines.add(noteMapper.map(item));
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public void updateNote(Integer id, String title, String text) throws Exception {
        List<Note> notes = getAllNotes();
        Note updateNote = getNodeById(notes, id);
        updateNote.setTitle(title);
        updateNote.setText(text);
        saveNote(notes);

    }

    @Override
    public void deleteNote(Integer id) throws Exception {
        List<Note> notes = getAllNotes();
        Note delNote = getNodeById(notes, id);
        notes.remove(delNote);
        saveNote(notes);
    }

    @Override
    public List<Note> getAllNotes() {
        List<String> lineNote = fileOperation.readAllLines();
        List<Note> notes = new ArrayList<>();
        for (String line : lineNote) {
            notes.add(noteMapper.map(line));
        }
        return notes;
    }

    @Override
    public Note readNote(Integer id) throws Exception {
        List<Note> notes = getAllNotes();
        return getNodeById(notes, id);

    }

    public Note getNodeById(List<Note> notes, Integer id) throws Exception {
        for (Note note : notes) {
            if (note.getId() == id) {
                return note;
            }
        }
        throw new Exception("Записка не найдена");
    }

}
