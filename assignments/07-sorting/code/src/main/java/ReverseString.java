import java.util.Arrays;

/* https://leetcode.com/problems/reverse-string/description/ */
public class ReverseString {
    public static void main(String[] args) {
        char[] s ={'h', 'a', 'n', 'n', 'a', 'h'}; // 'h', 'e', 'l', 'l', 'o'
        reverseString(s);
    }

    static public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start <= end) {
            swap(s, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }

    static public void swap(char[] s, int first, int second) {
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }
}
