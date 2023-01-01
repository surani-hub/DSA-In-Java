package medium;

/* https://leetcode.com/problems/reverse-vowels-of-a-string/ */
public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    static public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (start<end && !vowels.contains((chars[start])+"")) {
                start++;

            }
            while(start<end && !vowels.contains((chars[end])+"")) {
                end--;

            }
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;

        }
        return new String(chars);
    }
}
