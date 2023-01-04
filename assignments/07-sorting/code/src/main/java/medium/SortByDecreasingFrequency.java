package medium;

import java.util.*;

/* https://leetcode.com/problems/sort-characters-by-frequency/description/ */
public class SortByDecreasingFrequency {
    public static void main(String[] args) {
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }

    static public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> {
            return b.getValue() - a.getValue();
        });

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
