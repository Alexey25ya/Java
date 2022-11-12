
// 2.Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с
// количеством повторений. Отсортировать по убыванию популярности Имени.

package Java.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task5_2 {
    // public static void sort(String[] array){
    //     {
    //         HashMap<String, String> map = new HashMap<>();
    //         for (String part : array) {
    //             String full[] = part.split(" ");      
    //             String first = full[0].trim();
    //             String second = full[1].trim();
    //             map.put(second, first);
    //         }
    //         System.out.println(map.values());
    //         int i=0;
    //         for (String value : map.values()){
    //             if (value.equals(value)){
    //                 i++;                    
    //             }                                
    //         }
    //         System.out.println(value+i);

    //     }
        public static void showSortedNames(String[] array) {
            Map<String, Integer> map = new HashMap<>();
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i].split(" ")[0].equals(array[j].split(" ")[0])) {
                        count++;
                    }
                }
                map.putIfAbsent(array[i].split(" ")[0], count);
                count = 0;
            }
            List<Integer> mapValues = new ArrayList<>(map.values());
            Collections.sort(mapValues);
            System.out.println(mapValues);
            map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(System.out::println);
        }

    public static void main(String[] args) {
        String[] arrayNames = new String[] {
            "Иван Иванов",
            "Светлана Петрова",
            "Кристина Белова",
            "Анна Мусина",
            "Анна Крутова",
            "Иван Юрин",
            "Петр Лыков",
            "Павел Чернов",
            "Петр Чернышов",
            "Мария Федорова",
            "Марина Светлова",
            "Мария Савина",
            "Мария Рыкова",
            "Марина Лугова",
            "Анна Владимирова",
            "Иван Мечников",
            "Петр Петин",
            "Иван Ежов",
    };
    showSortedNames(arrayNames);
    }
}
