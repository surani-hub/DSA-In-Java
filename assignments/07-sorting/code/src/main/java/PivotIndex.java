/* https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan&id=level-1 */
/* https://leetcode.com/problems/find-the-middle-index-in-array/description/ */
public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {2, 1, -1};
        System.out.println(pivotIndex(nums));
    }

    static public int pivotIndex(int[] nums) {
        int lsum = 0;
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int rsum = totalSum;
        for (int i = 0; i < nums.length; i++) {
            rsum -= nums[i];
            if (lsum == rsum) {
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }

    static public int pivotIndex1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int lsum = 0, rsum = 0;
            for (int j = 0; j < i; j++) {
                lsum += nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                rsum += nums[k];
            }

            if (lsum == rsum) {
                return i;
            }
        }
        return -1;
    }
}
