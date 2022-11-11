// 3. В калькулятор добавьте возможность отменить последнюю операцию.

package Java.homework4;

import java.util.logging.*;
import java.util.Scanner;
import java.io.IOException;

public class task4_3

{
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
        Logger logger = Logger.getLogger(task4_3.class.getName());
        FileHandler fh = new FileHandler("logcalc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.printf("Введите первое число: ");
            int a = iScanner.nextInt();
            logger.log(Level.INFO, "Пользователь ввел число " + a);
            System.out.println();
            System.out.printf(
                    "Введите <+> для сложения; <-> для вычетания;<*> для умножения; </> для деления\n");
            String choice = iScanner.next();
            logger.log(Level.INFO, "Пользователь ввел символ операции: " + choice);
            System.out.println();
            System.out.printf("Введите второе число: ");
            int b = iScanner.nextInt();
            logger.log(Level.INFO, "Пользователь ввел число " + b);

            int res = calc(a, choice, b);
            System.out.printf("Результат: %d %s %d = %d", a, choice, b, res);
            logger.log(Level.INFO, "Результат: " + a + choice + b + "=" + res);
            System.out.println();
            System.out.println(
                    " Для отмены операции нажмите '1'\n Для выхода из калькулятора нажмите'q'\n Для продолжения работы с результатом предыдущей операции нажмите '='");
            String menu = iScanner.next();
            if (menu.equals("1")) {
                logger.log(Level.INFO, "Пользователь отменил операцию");
                System.out.println("Первое число равно " + a);
                System.out.printf("Введите <+> для сложения; <-> для вычетания;<*> для умножения; </> для деления\n");
                choice = iScanner.next();
                logger.log(Level.INFO, "Пользователь ввел символ операции: " + choice);
                System.out.printf("Введите второе число: ");
                b = iScanner.nextInt();
                logger.log(Level.INFO, "Пользователь ввел число " + b);
                res = calc(a, choice, b);
                System.out.printf("Результат: %d %s %d = %d", a, choice, b, res);
            }
            if (menu.equals("=")) {
                a = res;
                System.out.println("Первое число равно " + res);
                System.out
                        .printf("Введите <+> для сложения; <-> для вычетания;<*> для умножения; </> для деления\n");
                choice = iScanner.next();
                logger.log(Level.INFO, "Пользователь ввел символ операции: " + choice);
                System.out.printf("Введите второе число: ");
                b = iScanner.nextInt();
                logger.log(Level.INFO, "Пользователь ввел число " + b);
                res = calc(a, choice, b);
                logger.log(Level.INFO, "Результат: " + a + choice + b + "=" + res);
            }
            if (menu.equals("q")) {
                iScanner.close();
                break;
            }

        }
    }
}
