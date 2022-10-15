// Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
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

    public static void main(String[] args) {
        // Реализовать простой калькулятор
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf(
                "Введите <+> для сложения; <-> для вычетания;<*> для умножения; </> для деления\n");
        String choice = iScanner.next();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();
        iScanner.close();
        int res = calc(a, choice, b);
        System.out.printf("Результат: %d %s %d = %d", a, choice, b, res);
    }
}