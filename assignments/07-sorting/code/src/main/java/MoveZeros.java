/* https://leetcode.com/problems/move-zeroes/description/ */

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    static public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums) {
           if(num != 0){
               nums[i++] = num;
           }
        }
        for (int k = i; k < nums.length; k++) {
            nums[k] = 0;
        }
    }
}
