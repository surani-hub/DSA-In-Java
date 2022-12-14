import java.util.Arrays;

/* https://leetcode.com/problems/merge-sorted-array/description/ */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);

        mergeSorted(nums1, m, nums2, n);
    }

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        int z = 0;
        for (int k = m; k < nums3.length; k++) {
            nums3[k] = nums2[z++];
        }
        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));
    }

    static public void mergeSorted(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[k--] = nums1[p1--];
            } else {
                nums1[k--] = nums2[p2--];
            }
        }
        while (p2 >= 0) {
            nums1[k--] = nums2[p2--];
        }
        System.out.println(Arrays.toString(nums1));
    }
}
