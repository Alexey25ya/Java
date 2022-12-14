package views;

import java.util.List;

import controller.NoteController;
import models.Note;

public class ViewNote {
    NoteController noteController;
    NoteAdder noteAdder;

    public ViewNote(NoteController noteController, NoteAdder noteAdder) {
        this.noteController = noteController;
        this.noteAdder = noteAdder;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            String command = noteAdder.promptString("Введите команду READ,CREATE,UPDATE,LIST,DELETE,EXIT: ");
            try {
                com = Commands.valueOf(command);
            } catch (IllegalArgumentException e) {
                System.out.println("Неопознанная команда");
            }
            if (com == Commands.EXIT)
                return;
            try {
                switch (com) {
                    case CREATE:
                        Note newNote = noteAdder.setNote();
                        noteController.addNote(newNote);
                        break;
                    case READ:
                        Integer findId = noteAdder.promptInteger("Введите id для поиска: ");
                        Note findNote = noteController.readNote(findId);
                        System.out.println(findNote);
                        break;
                    case LIST:
                        List<Note> notes = noteController.readAllNotes();
                        for (Note note : notes) {
                            System.out.println(note);
                            System.out.println();
                        }
                        break;
                    case UPDATE:
                        Integer findIdforUpdate = noteAdder.promptInteger("Введите id для поиска: ");
                        String titleForUpdate = noteAdder.promptString("Заголовок: ");
                        String textForUpdate = noteAdder.promptString("Текст: ");
                        noteController.updateNote(findIdforUpdate, titleForUpdate, textForUpdate);

                        break;
                    case DELETE:
                        Integer findIdforDel = noteAdder.promptInteger("Введите id для поиска: ");
                        noteController.deleteNote(findIdforDel);
                        break;
                    case EXIT:
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
