import java.util.Scanner;

/*
    1. Write a program to print whether a number is even or odd, also take input from the user.
*/
public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");

        if (isEvenOrOdd(in.nextInt()))
            System.out.println("Even number");
        else
            System.out.println("Odd");
    }

    static boolean isEvenOrOdd(int num) {
        return num % 2 == 0;
    }
}
