//2. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
package Java.homework4;

import java.util.LinkedList;
import java.util.Scanner;

public class task4_2 {

    public static LinkedList<Integer> fillLinkedList() {
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i=0;i<10;i++){
            ll.add( 0 + (int)(Math.random()*100));            
        }       
        System.out.println(ll);
        return ll;
    }

    public static void enqueue(LinkedList<Integer> ll, int element) {
        ll.addLast(element);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        return ll.removeFirst();
    }

    public static int first(LinkedList<Integer> ll) {
        return ll.peekFirst();

    }

    public static void queue(LinkedList<Integer> ll) {
        try (Scanner scanner = new Scanner(System.in)) {
        choice: while (true) {
                System.out.print("Нажмите:\n1 - для добавления числа в список\n2 - для вывода на экран и удаления первого элемента списка\n3 - для отображения первого элемента\nq - для выхода \n");
                String input = scanner.nextLine();
                switch (input) {
                    case ("1"):
                        System.out.println("Введите число для добавления");
                        input = scanner.nextLine();
                        int choice = Integer.parseInt(input);
                        enqueue(ll, choice);
                        System.out.println("Текущий список: " + ll);                        
                        break;

                    case ("2"):
                        System.out.printf("Элемент %d удален\n", dequeue(ll));
                        System.out.println("Текущий список: " + ll);

                        break;

                    case ("3"):
                        int firstElement = first(ll);
                        System.out.printf("Первый элемент: %d \n", firstElement);
                        System.out.println("Текущий список: " + ll);
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
        LinkedList<Integer> ll=fillLinkedList();
        queue(ll);
    }
}
