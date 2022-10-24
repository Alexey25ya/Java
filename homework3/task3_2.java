// 2) Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

public class task3_2 {
    public static ArrayList<Integer> RemoveEven(ArrayList<Integer> nums) {
        for (int i =nums.size()-1 ;i >= 0;  i--) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);                
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {   add(-6);
                add(-2);
                add(1);
                add(2);
                add(-7);
                add(3);
                add(5);
                add(6);
                add(10);
            }
        };
        System.out.println("Заданный список:\n"+nums);
        System.out.println("Результирующий список:\n"+RemoveEven(nums));        ;
    }

}