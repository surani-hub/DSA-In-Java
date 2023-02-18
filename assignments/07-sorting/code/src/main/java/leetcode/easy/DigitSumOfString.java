package leetcode.easy;

public class DigitSumOfString {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        System.out.println(digitSum(s, k));
    }

    static public String digitSum(String s, int k) {
        while (s.length() > k) {
            String newStr = "";
            for (int i = 0; i < s.length(); i += k) {
                String str = s.substring(i, Math.min(i + k, s.length()));
                int sum = 0;
                for (int l = 0; l < str.length(); l++) {
                    sum += str.charAt(l) - '0';
                }
                newStr += "" + sum;
            }
            s = newStr;
        }
        return s;
    }
}
