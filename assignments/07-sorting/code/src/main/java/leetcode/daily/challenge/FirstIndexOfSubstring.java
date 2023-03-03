package leetcode.daily.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstIndexOfSubstring {
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    static public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}
