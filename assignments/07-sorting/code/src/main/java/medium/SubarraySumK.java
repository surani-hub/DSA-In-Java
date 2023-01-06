package medium;

import java.util.HashMap;

/* https://leetcode.com/problems/subarray-sum-equals-k/description/ */
public class SubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;

        System.out.println(subarraySum(nums, k));
    }

    static public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
        }
        return count;
    }

    static public int subarraySumI(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
