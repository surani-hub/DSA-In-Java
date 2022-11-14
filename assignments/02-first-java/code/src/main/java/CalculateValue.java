import java.util.Scanner;

/*
    4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
*/
public class CalculateValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char op = in.next().trim().charAt(0);

        if(op == '+'){
            System.out.println(num1+num2);
        }
        if(op == '-'){
            System.out.println(num1-num2);
        }
        if(op == '*'){
            System.out.println(num1*num2);
        }
        if(op == '/'){
            System.out.println(num1/num2);
        }
    }
}
