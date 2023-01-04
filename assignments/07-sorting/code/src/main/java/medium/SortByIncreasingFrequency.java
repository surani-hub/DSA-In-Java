package medium;

import java.util.*;

/* https://leetcode.com/problems/sort-array-by-increasing-frequency/description/ */
public class SortByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    static public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a);

        int[] res = new int[nums.length];
        int i = 0;
        for (int number : list) {
            for (int j = 0; j < map.get(number); j++) {
                res[i++] = number;
            }
        }
        return res;
    }
}
