package contests.leetcode.biweekly.contest95;

import java.util.Arrays;

/* https://leetcode.com/contest/weekly-contest-328/problems/difference-between-element-sum-and-digit-sum-of-an-array/ */
public class DifferenceSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(differenceOfSum(nums));
    }

    static public int differenceOfSum(int[] nums) {
        int elementSum = sumElements(nums);
        int digitSum = sumDigits(nums);
        return Math.abs(elementSum - digitSum);
    }

    static public int sumDigits(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += getDigits(num);
        }
        return sum;
    }

    static public int getDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    static public int sumElements(int[] nums) {
        return Arrays.stream(nums).sum();
    }
}
