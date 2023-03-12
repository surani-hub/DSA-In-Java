package gfg.alphaDsaSheet;

import java.util.Arrays;
import java.util.Random;

/* https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1 */
public class KthLargestElement {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {7, 10, 4, 3, 20, 15};
        int K = 3;

        System.out.println(findKthLargest(arr, K));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int pivotIndex = partition(nums, left, right);
            if (pivotIndex == nums.length - k) {
                return nums[pivotIndex];
            } else if (pivotIndex > nums.length - k) {
                right = pivotIndex - 1;
            } else {
                left = pivotIndex + 1;
            }
        }
        return -1;
    }

    static public int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, right);
        return i;
    }
}
