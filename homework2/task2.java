// Дана json строка (сохранить в файл и читать из файла) [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова", "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.*;
// import java.util.HashMap;

public class task2 {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("task2.json")) {
            // читаем посимвольно
            int c;
            StringBuilder sb = new StringBuilder();
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
            System.out.print(sb);
            // String text = sb.toString();
            // String[] words = text.split(",");
            // for (String word : words) {
            // System.out.println(word);
            // }
            // HashMap<String, String> map =sb ;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
