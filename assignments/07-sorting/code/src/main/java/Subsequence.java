/* https://leetcode.com/problems/is-subsequence/description/?envType=study-plan&id=level-1 */
public class Subsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));

    }

    static public boolean isSubsequence(String s, String t) {
        int s1 = 0, t1 = 0;
        while (s1 < s.length() && t1 < t.length()) {
            if (s.charAt(s1) == t.charAt(t1)) {
                s1++;
                t1++;
            } else {
                t1++;
            }
        }
        return s1 == s.length();
    }
}
