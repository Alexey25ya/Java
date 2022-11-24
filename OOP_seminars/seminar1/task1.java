package Java.OOP_seminars.seminar1;

import java.util.ArrayList;
import java.util.List;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Масло", 50.0));
        prods.add(new Product("Хлеб", 40.0));
        prods.add(new Product("Шоколад", 30.0));
        prods.add(new Product("Снек", 20.0));
        prods.add(new Milk("Простоквашино", 70.0, 5));
        prods.add(new Choco("Аленка", 45.0, 125, 200));
        prods.add(new Water("Шишкин лес", 25.5, 1));
        VendingMachine v1 = new VendingMachine(prods);
        // VendingMachine v2 = new VendingMachine();
        System.out.println(v1);
        System.out.println(v1.getProductBy("Масло"));
        System.out.println(v1.getProductBy(30.0));
        VendingMachine v2 = new VendingMachine();
        System.out.println();
        System.out.println(v2);
    }
}