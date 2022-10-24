
// 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;

public class task3_3 {
    public static int Min(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
        }
        return min;
    }

    public static int Max(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static float Average(ArrayList<Integer> nums) {
        float sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = (new ArrayList<Integer>() {
            {
                add(-5);
                add(8);
                add(-3);
                add(3);
                add(5);
                add(6);
                add(34);
            }
        });
        System.out.println(nums);
        System.out.println("Минимальное равно: "+Min(nums));
        System.out.println("Максимальное равно: "+Max(nums));
        System.out.println("Среднее арифметическое равно: "+ Average(nums));
    }
}