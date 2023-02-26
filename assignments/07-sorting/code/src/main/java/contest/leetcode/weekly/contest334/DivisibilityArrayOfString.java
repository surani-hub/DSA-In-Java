package contest.leetcode.weekly.contest334;

import java.util.Arrays;

public class DivisibilityArrayOfString {
    public static void main(String[] args) {
        String word = "998244353";
        int m = 3;
        System.out.println(Arrays.toString(divisibilityArray(word, m)));
    }

    static public int[] divisibilityArray(String word, int m) {
        char[] digits = word.toCharArray();
        int[] ans = new int[word.length()];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            if (Character.isDigit(digits[i])) {
                sb.append(digits[i]);
                int num = Integer.parseInt(sb.toString());
                if (num % m == 0) {
                    ans[i] = 1;
                } else {
                    sb.setLength(0);
                    sb.append(digits[i]);
                }
            }
        }
        return ans;
    }
}
