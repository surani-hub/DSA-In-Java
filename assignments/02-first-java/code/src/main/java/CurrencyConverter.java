import java.util.Scanner;

/*
    6. Input currency in rupees and output in USD
*/
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount in rupees ");
        int amount = in.nextInt();

        System.out.println(amount / 80.54 + " Dollars");
    }
}
