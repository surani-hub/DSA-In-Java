package leetcode.easy;

import java.util.HashMap;

/* https://leetcode.com/problems/most-frequent-even-element/description/ */
public class MostFrequentEven {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(nums));
    }

    static public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1, maxFreq = -1;
        for (int num : map.keySet()) {
            if (map.get(num) > maxFreq) {
                maxFreq = map.get(num);
                ans = num;
            } else if (map.get(num) == maxFreq && ans > num) {
                ans = num;
            }
        }
        return ans;
    }
}
