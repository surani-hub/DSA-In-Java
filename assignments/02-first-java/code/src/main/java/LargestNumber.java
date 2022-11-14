import java.util.Scanner;

/*
    5. Take 2 numbers as input and print the largest number.
*/
public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(Math.max(num1, num2));
    }
}
