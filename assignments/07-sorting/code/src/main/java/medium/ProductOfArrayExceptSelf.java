package medium;

import java.util.Arrays;

/* https://leetcode.com/problems/product-of-array-except-self/description/ */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(productExceptSelfI(nums)));
        productExceptSelfI(nums);
    }

    // O(n2)
    static public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            res[k++] = prod;
        }
        return res;
    }

    // O(n) using prefix sum algorithm
    static public int[] productExceptSelfI(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;

        int prod = 1;
        int count = 0;

        //prod = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                prod *= nums[i];
            }
        }

        if (count == 0) {
            for (int num : nums) {
                res[k++] = prod / num;
            }
        } else if (count == 1) {
            for (int num : nums) {
                if (num == 0) {
                    res[k++] = prod;
                } else {
                    res[k++] = 0;
                }
            }
        } else if (count == 2) {
            for (int x = 0; x < nums.length; x++) {
                res[k++] = 0;
            }
        }
        return res;
    }

}
