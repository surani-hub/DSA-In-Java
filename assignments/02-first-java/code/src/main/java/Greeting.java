import java.util.Scanner;

/*
    2. Take name as input and print a greeting message for that particular name.
*/
public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println(greeting(name));
    }

    static String greeting(String name){
        return "Hello "+name;
    }

}
