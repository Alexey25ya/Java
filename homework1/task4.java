// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

public class task4 {
    int q1 = 20;
    int w2 = 5;
    int e = 69;

    public static void findNum(int q1, int w2, int e) {

        int q2 = 0;
        int w1 = 0;
        if ((e - q1 - w2) >= 0) {
            while (((e - q1 - w2 - q2) % 10) != 0) {
                q2++;
                w1 = e - q1 - w2 - q2;
            }
            int w = w1 + w2;
            int q = q1 + q2;
            System.out.printf("%d + %d = %d", q, w, e);
        } else {
            System.out.println("Решения уравнения нет");
        }
    }

    public static void main(String[] args) {
        int q1 = 20;
        int w2 = 5;
        int e = 69;
        findNum(q1, w2, e);
    }
}
