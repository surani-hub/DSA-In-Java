package contest.leetcode.weekly.contest331;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfVowelString {
    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2},
                {1, 4},
                {1, 1}};
        System.out.println(Arrays.toString(countVowelStrings(words, queries)));
    }

    public static int[] countVowelStrings(String[] words, int[][] queries) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int[] prefix = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                prefix[i] = 1;
            }
        }
        for (int i = 1; i < words.length; i++) {
            prefix[i] += prefix[i - 1];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            result[i] = prefix[right] - (left == 0 ? 0 : prefix[left - 1]);
        }
        return result;
    }

//    static public int[] vowelStrings(String[] words, int[][] queries) {
//        List<Integer> ans = new ArrayList<>();
//        for (int[] query : queries) {
//            ans.add(countVowelStrings(query, words));
//        }
//        return ans.stream().mapToInt(Integer::intValue).toArray();
//    }
//
//    public static int countVowelStrings(int[] query, String[] words) {
//        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//        int count = 0;
//        for (int i = query[0]; i <= query[query.length - 1]; i++) {
//            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
//                count++;
//            }
//        }
//        return count;
//    }
}
