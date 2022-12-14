
import controller.NoteController;
import models.FileOperation;
import models.FileOperationImpl;
import models.LogManagerImpl;
import models.Logger;
import models.NoteManager;
import models.NoteManagerImpl;
import views.NoteAdder;
import views.ViewNote;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperationImpl("Java/OOP_seminars/homework7/notes.txt");
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteManager noteManagerImpl2 = new LogManagerImpl(noteManagerImpl,
                new Logger("Java/OOP_seminars/homework7/log.txt"));
        NoteController noteController = new NoteController(noteManagerImpl2);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder);
        view.run();
    }
}
