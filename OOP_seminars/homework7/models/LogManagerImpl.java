package models;

import java.util.List;

public class LogManagerImpl implements NoteManager {
    private NoteManager noteManager;
    private Loggable logger;

    public LogManagerImpl(NoteManager noteManager, Loggable logger) {
        this.noteManager = noteManager;
        this.logger = logger;

    }

    @Override
    public void addNote(Note note) {
        noteManager.addNote(note);
        logger.log("Запись <" + note + "> добавлена");
    }

    @Override
    public void deleteNote(Integer Id) throws Exception {
        noteManager.deleteNote(Id);
        logger.log("Запись с ID <" + Id + "> удалена");

    }

    @Override
    public List<Note> getAllNotes() {
        List<Note> result = noteManager.getAllNotes();
        logger.log("Просмотр список записей");
        return result;
    }

    @Override
    public Note readNote(Integer id) throws Exception {
        Note result = noteManager.readNote(id);
        logger.log("Просмотр записи с id " + id);
        return result;
    }

    @Override
    public void updateNote(Integer id, String title, String text) throws Exception {
        noteManager.updateNote(id, title, text);
        logger.log("Запись с id <" + id + "> изменена");
    }
}
