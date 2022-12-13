package Homework6.views;

import java.util.List;

import Homework6.controller.NoteController;
import Homework6.models.Note;

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
            String command = noteAdder.promptString("Введите команду: ");
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

                    case LIST:
                        List<Note> notes = noteController.readAllNotes();
                        for (Note note : notes) {
                            System.out.println(note);
                            System.out.println();
                        }
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
