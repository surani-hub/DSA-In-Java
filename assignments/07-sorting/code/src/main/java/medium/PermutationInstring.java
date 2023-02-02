package medium;

public class PermutationInstring {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "eidbaaczw";
        System.out.println(checkInclusion(s1, s2));
    }

    static public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 > len2) {
            return false;
        }
        int[] frequency = new int[26];
        for (int i = 0; i < len1; i++) {
            frequency[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < len2; i++) {
            frequency[s2.charAt(i) - 'a']--;
            if (i - len1 >= 0) {
                frequency[s2.charAt(i - len1) - 'a']++;
            }
            if (isEmpty(frequency)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(int[] frequency) {
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
