package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagrams {
    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        System.out.println(removeAnagrams(words));
    }

    static public List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> list = new ArrayList<>();
        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            if (!sorted.equals(prev)) {
                list.add(word);
                prev = sorted;
            }
        }
        return list;
    }
}
