package gfg.alphaDsaSheet;

/* https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1 */

import java.util.Random;

public class KthSmallestElement {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {7, 10, 4, 3, 20, 15};
        int K = 3;

        System.out.println(kthSmallest(arr, 0, N, K));
    }

    static public int kthSmallest(int[] arr, int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int pivot = partition(arr, l, r);

            if (pivot - l == k - 1)
                return arr[pivot];

            if (pivot - l > k - 1)
                return kthSmallest(arr, l, pivot - 1, k);

            return kthSmallest(arr, pivot + 1, r, k - pivot + l - 1);
        }
        return -1;
    }

    public static int partition(int[] arr, int l, int r) {
        int pivotIndex = new Random().nextInt(r - l + 1) + l;
        int pivotValue = arr[pivotIndex];
        swap(arr, pivotIndex, r);
        int partitionIndex = l;
        for (int i = l; i < r; i++) {
            if (arr[i] <= pivotValue) {
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr, partitionIndex, r);
        return partitionIndex;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
