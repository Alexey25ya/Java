import java.io.File;
import java.util.Collections;
import java.util.List;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task1 {
    public static void main(String[] args) {
        // NullPointerException:

        String name = null;
        System.out.println(name.length());

        // ClassCastException:

        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);

        // NumberFormatException

        String number = "133erg";
        int result = Integer.parseInt(number);
        System.out.println(result);

        // UnsupportedOperationException:

        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());

    }
}