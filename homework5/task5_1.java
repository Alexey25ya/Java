// 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Java.homework5;

import java.util.HashMap;
import java.util.Scanner;

public class task5_1 {
    public static void phonebook(HashMap<Integer, String> map) {
        try (Scanner scanner = new Scanner(System.in)) {
            choice: while (true) {
                System.out.print(
                        "Нажмите:\n1 - для поиска контакта\n2 - для добавления контакта\n3 - для удаления контакта\n4 - для просмотра всей телефонной книги\nq - для выхода \n");
                String input = scanner.nextLine();
                switch (input) {
                    case ("1"):
                        System.out.println("Введите фамилию контакта");
                        String name = scanner.nextLine();
                        for (var item : map.entrySet())
                            if (item.getValue().equals(name)) {
                                System.out.println("Контакт " + name + " найден: " + item.getKey());
                            }

                        break;

                    case ("2"):
                        System.out.println("Введите фамилию: ");
                        name = scanner.nextLine();
                        System.out.println("Введите номер телефона: ");
                        int key = scanner.nextInt();
                        map.putIfAbsent(key, name);
                        System.out.println(map);
                        break;
                    case ("3"):
                        System.out.println("Введите номер телефона контакта телефонной книги, который хотите удалить: ");
                        key = scanner.nextInt();;
                        map.remove(key);
                        System.out.println(map);
                        break;
                    case ("4"):
                        System.out.println(map);
                        break;

                    case ("q"):
                        break choice;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, String> phonebook = new HashMap<>();

        phonebook.put(89621213, "Petrov");
        phonebook.put(86516256, "Bush");
        phonebook.put(8082771, "Tramp");
        phonebook.put(182348, "Petrov");
        phonebook.put(162348, "Ivanov");
        phonebook.put(8676498, "Ivanov");

        System.out.println(phonebook);
        phonebook(phonebook);

    }

}


// 3.На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И
// вывести Доску.