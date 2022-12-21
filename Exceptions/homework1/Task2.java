import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 1, 2, 3, 4 };
        int arr2[] = { 5, 5, 4, 1, 2, 3, 105 };
        System.out.println(Arrays.toString(resultArray(arr1, arr2)));

    }

    public static int[] resultArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] = arr1[i] - arr2[i];
        }
        return resultArr;
    }
}
