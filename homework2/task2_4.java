//4*. К калькулятору из предыдущего дз добавить логирование.
import java.util.logging.*;
import java.util.Scanner;
import java.io.IOException;

public class task2_4 {
    public static int calc(int a, String choice, int b) {
        int res = 0;
        switch (choice) {
            case ("+"):
                res = a + b;
                break;

            case ("-"):
                res = a - b;
                break;

            case ("*"):
                res = a * b;
                break;

            case ("/"):
                res = a / b;
                break;

            default:
                break;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task2_1.class.getName());
        FileHandler fh = new FileHandler("logcalc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        logger.log(Level.INFO, "Пользователь ввел число " + a);
        System.out.printf(
                "Введите <+> для сложения; <-> для вычетания;<*> для умножения; </> для деления\n");
        String choice = iScanner.next();
        logger.log(Level.INFO, "Пользователь ввел символ операции: " + choice);
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        logger.log(Level.INFO, "Пользователь ввел число " + b);
        iScanner.close();
        int res = calc(a, choice, b);
        System.out.printf("Результат: %d %s %d = %d", a, choice, b, res);
        logger.log(Level.INFO, "Результат: "+ a + choice + b  + "="+ res);
    }
}
