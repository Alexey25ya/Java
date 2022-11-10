// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
package Java.homework4;

import java.util.LinkedList;



public class task4_1 {

    public static LinkedList<Integer> fillLinkedList() {
        LinkedList<Integer> ll=new LinkedList<>();
        for (int i=0;i<10;i++){
            ll.add( 0 + (int)(Math.random()*100));            
        }       
        System.out.println(ll);
        return ll;
        
    }
    public static void reverceLinkedList(LinkedList<Integer> ll) {
        LinkedList<Integer> reverceLl = new LinkedList<Integer>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            reverceLl.add(ll.get(i));
        }
        System.out.println(reverceLl);

    }
    public static void main(String[] args) {
        reverceLinkedList(fillLinkedList());
    }
}

// 3. В калькулятор добавьте возможность отменить последнюю операцию.
// Пример
// 1+2
// 3
// +4
// 7
// Отмена
// 3
// *3
//9