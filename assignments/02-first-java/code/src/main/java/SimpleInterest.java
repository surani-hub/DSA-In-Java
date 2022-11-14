import java.util.Scanner;

/*
    3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
*/
public class SimpleInterest {
    public static void main(String[] args) {

        System.out.println(calculateInterest());
    }

    static double calculateInterest(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input principal, time, and rate ");
        double principal = in.nextDouble();
        double time = in.nextDouble();
        double rate = in.nextDouble();

        return (principal * time * rate)/100;
    }
}
