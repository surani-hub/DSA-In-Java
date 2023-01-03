package recursion;

import java.util.Scanner;

public class PrintNumberIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        printIncreasing(number);
    }

    static public void printIncreasing(int number) {
        if (number == 1) {
            System.out.println(number + " ");
            return;
        }
        printIncreasing(number - 1);
        System.out.println(number + " ");
    }
}
