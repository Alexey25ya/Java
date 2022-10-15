
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class task1 {

    static double sum(int sum) {
        if (sum == 1)
            return 1;
        return sum + sum(sum - 1);
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(factor(5));
    }
}
