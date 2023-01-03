package recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        printDecreasing(number);
    }

    static public void printDecreasing(int number) {
        if (number == 1) {
            System.out.println(number);
            return;
        }
        System.out.println(number + " ");
        printDecreasing(number - 1);
    }
}
