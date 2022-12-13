package Homework6;

import Homework6.controller.NoteController;
import Homework6.models.FileOperation;
import Homework6.models.FileOperationImpl;
import Homework6.models.NoteManager;
import Homework6.models.NoteManagerImpl;
import Homework6.views.NoteAdder;
import Homework6.views.ViewNote;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperationImpl("Java/OOP_seminars/homework6/Homework6/notes.txt");
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteController noteController = new NoteController(noteManagerImpl);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder);
        view.run();
    }
}
