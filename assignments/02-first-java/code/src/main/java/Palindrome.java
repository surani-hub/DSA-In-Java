import java.util.Scanner;

/*
    8. To find out whether the given String is Palindrome or not.
*/
public class Palindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reversed)) {
            return true;
        }
        return false;
    }
}
