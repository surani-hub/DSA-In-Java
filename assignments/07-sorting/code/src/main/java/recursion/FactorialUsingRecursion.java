package recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(fact(number));

        System.out.println(factorial(5, 1));
    }

    static public int fact(int number) {
        if (number == 1) {
            return number;
        }
        return number * fact(number - 1);
    }

    static public int factorial(int i, int factVal) {
        if (i < 1) {
            return factVal;
        }
        return factorial(i - 1, factVal * i);
    }
}
