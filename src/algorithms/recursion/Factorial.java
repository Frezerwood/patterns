package algorithms.recursion;

public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int i) {

        if (i == 0) {
            return 1;
        }                               //Базовый случай

        return i * factorial((i - 1)); //Рекурсивный случай
    }
}
