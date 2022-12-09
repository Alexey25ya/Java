package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.Repository;
// import personal.model.RepositoryFile;
import personal.model.RepozitoryFileNew;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {

        // FileOperation fileOperation = new FileOperationImpl("users.txt");
        // Repository repository = new RepositoryFile(fileOperation);
        // UserController controller = new UserController(repository);
        // ViewUser view = new ViewUser(controller);
        // view.run();

        FileOperation fileOperation = new FileOperationImpl("usersNew.txt");
        Repository repositoryNew = new RepozitoryFileNew(fileOperation);
        UserController controller = new UserController(repositoryNew);
        ViewUser view = new ViewUser(controller);
        view.run();

    }
}
