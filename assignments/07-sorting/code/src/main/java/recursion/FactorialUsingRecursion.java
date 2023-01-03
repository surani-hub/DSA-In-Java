package recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(fact(number));
    }

    static public int fact(int number) {
        if (number == 1) {
            return number;
        }
        return number * fact(number - 1);
    }
}
