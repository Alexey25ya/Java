package Java.homework6;

// 1.Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2.Создать множество ноутбуков.
// 3.Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
//     1 - ОЗУ
//     2 - Объем ЖД
//     3 - Операционная система
//     4 - Цвет …

// 5.Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// 6.Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.*;

public class task {
    public static Integer enterFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для поиска: ");
        System.out.println(
                "1 по оперативной памяти\n2 по жесткому диску\n3 по операционной системе\n4по цвету\n");
        System.out.println("Ваш выбор: ");
        return scanner.nextInt();
    }
    public static void showResult(Map<String, Laptop> result){
        for (var Laptop : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", Laptop.getKey(), Laptop.getValue().toString());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> filter = new HashMap<>();
        Map<String, Laptop> result = new LinkedHashMap<>();
        Set<Laptop> Laptops = new HashSet<>();
        Laptop Laptop1 = new Laptop("2 Gb", "2 Tb", "Windows 10","Black");
        Laptop Laptop2 = new Laptop("2 Gb", "1 Tb", "Windows 10","White");
        Laptop Laptop3 = new Laptop("4 Gb", "2 Tb", "Mac OS","Green");
        Laptop Laptop4 = new Laptop("4 Gb", "1 Tb", "Mac OS","White");
        Laptop Laptop5 = new Laptop("3 Gb", "1 Tb", "Windows 11","Black");
        Laptops.add(Laptop1);
        Laptops.add(Laptop2);
        Laptops.add(Laptop3);
        Laptops.add(Laptop4);
        Laptops.add(Laptop5);
        Scanner scanner = new Scanner(System.in);
        filter.put(1, "ram");
        filter.put(2, "hdd");
        filter.put(3, "os");
        filter.put(4, "color");
        Integer choice = enterFilter();
        if (filter.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.printf("Введите название %s: \n", filter.get(1));
                    System.out.print("Ввод: \n");
                    String input = scanner.next();
                    Laptop.byRam(Laptops, input, result);
                    showResult(result);
                    break;
                }
                case 2: {
                    System.out.printf("Введите название %s : \n", filter.get(2));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Laptop.bySSD(Laptops, input, result);
                    showResult(result);
                    break;
                }
                case 3: {
                    System.out.printf("Введите название %s : \n", filter.get(3));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Laptop.byOs(Laptops, input, result);
                    showResult(result);
                    break;
                }
                case 4: {
                    System.out.printf("Введите название %s : \n", filter.get(4));
                    System.out.print("Ввод: ");
                    String input = scanner.next();
                    Laptop.byColor(Laptops, input, result);
                    showResult(result);
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();
    }
}