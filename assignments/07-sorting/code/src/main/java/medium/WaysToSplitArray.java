package medium;

/* https://leetcode.com/problems/number-of-ways-to-split-array/description/ */
public class WaysToSplitArray {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(waysToSplitArray(nums));
    }

    static public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        long lsum = 0, count = 0;
        long rsum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            lsum += nums[i];
            rsum = totalSum - lsum;
            if (lsum >= rsum) {
                count++;
            }
        }
        return count;
    }
}
