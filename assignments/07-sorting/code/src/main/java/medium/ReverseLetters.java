package medium;

/* https://leetcode.com/problems/reverse-only-letters/description/ */

class ReverseLetters {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
    }

    static public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (!isAlpha(chars[start])) {
                start++;
            }
            if (!isAlpha(chars[end])) {
                end--;
            }
            if (isAlpha(chars[start]) && isAlpha(chars[end])) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(chars);
    }

    static public boolean isAlpha(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
}