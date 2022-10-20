// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class task2_1 {

    public static int[] sort(int[] array) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(task2_1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    logger.log(Level.INFO, "Поменяли местами элемент " + array[j - 1] + " и элемент " + array[j]);
                }
            }
        }
        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = { 23, 45, 67, 1, 34, 6 };
        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        System.out.println("Отсортированный массив:\n" + Arrays.toString(sort(arr)));
    }
}
