import java.util.Arrays;

/* https://leetcode.com/problems/rotate-array/description/ */
class RotateArray {
    static public void rotateRight(int[] nums, int k) {
        for (int rotation = 0; rotation < k; rotation++) {
            int last = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = last;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateRight(nums, k);
        rotateLeft(nums, k);

        rotate(nums, k);
    }

    static public void rotate(int[] nums, int k) {
        int partition = nums.length - k;

        reverse(nums, 0, partition);
        reverse(nums, partition, nums.length);
        reverse(nums, 0, nums.length);
        System.out.println("after rotation:" + Arrays.toString(nums));
    }

    static public void reverse(int[] nums, int start, int end) {
        end = end - 1;
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    static public void rotateLeft(int[] nums, int k) {
        for (int rotation = 0; rotation < k; rotation++) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = first;
        }
        System.out.println(Arrays.toString(nums));
    }
}