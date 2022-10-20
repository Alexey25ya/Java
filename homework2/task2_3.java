// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;
public class task2_3 {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse(); 
        String invertedText = strBuilder.toString();
    
        return text.equalsIgnoreCase(invertedText) ;
    }
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            System.out.println("Введите строку для проверки на палиндром: ");
            String text = iScanner.nextLine();
            System.out.println(isPalindrome(text));
        }
}
}
