import java.util.Arrays;

/* https://leetcode.com/problems/missing-number/description/ */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumberOptimised(nums));
    }

    static public int missingNumber(int[] nums) {
        int numsSum = 0;
        int sum = 0;
        for (int start = 0; start < nums.length; start++) {
            numsSum += nums[start];
        }
        for (int num = 1; num <= nums.length; num++) {
            sum += num;
        }
        return sum - numsSum;

    }

    static public int missingNumberOptimised(int[] nums){
        Arrays.sort(nums);
        for(int index = 0; index< nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
    }
}
