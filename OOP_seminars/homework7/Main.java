
import controller.NoteController;
import models.FileOperation;
import models.FileOperationImpl;
import models.NoteManager;
import models.NoteManagerImpl;
import views.NoteAdder;
import views.ViewNote;

public class Main {
    public static void main(String[] args) {

        FileOperation fileOperation = new FileOperationImpl("Java/OOP_seminars/homework7/notes.txt");
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteController noteController = new NoteController(noteManagerImpl);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder);
        view.run();
    }
}
