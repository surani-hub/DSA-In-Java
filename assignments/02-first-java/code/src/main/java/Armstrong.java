import java.util.Scanner;

/*
    9. To find Armstrong Number between two given number.
*/
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
    }

    static boolean isArmstrong(int num) {
        int temp = num;
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum += rem * rem * rem;
            num /= 10;
        }
        return temp == sum;
    }
}
