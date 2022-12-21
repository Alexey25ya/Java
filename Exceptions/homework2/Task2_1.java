
import java.util.Scanner;

import javax.xml.namespace.QName;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно 
// приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task2_1 {
    public static void main(String[] args) {

        System.out.println(getNum());
    }

    public static float getNum() {
        float input;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                input = scanner.nextFloat();

                break;
            }
            System.out.println("\nВы ввели не дробное число!");
        }
        return input;
    }
}