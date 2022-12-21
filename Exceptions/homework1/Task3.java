import java.util.Arrays;

// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен 
//  частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Task3 {
    public static void main(String[] args) {
        int arr1[] = { 5, 5, 4, 1, 2, 3, 105 };
        int arr2[] = { 0, 1, 2, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(resultArray(arr1, arr2)));

    }

    public static int[] resultArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] resultArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException(
                        "!!!!! " + (i + 1) + " элемент во втором массиве равен нулю. На ноль делить НЕЛЬЗЯ!!!!");
            }
            resultArr[i] = arr1[i] / arr2[i];
        }
        return resultArr;
    }
}