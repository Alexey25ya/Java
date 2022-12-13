package Homework6.views;

import java.util.Scanner;
import Homework6.models.Note;

public class NoteAdder {

    protected String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    protected Integer promptInteger(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }

    Note setNote() {
        String title = promptString("Заголовок: ");
        String text = promptString("Текст: ");
        return new Note(title, text);
    }

}
