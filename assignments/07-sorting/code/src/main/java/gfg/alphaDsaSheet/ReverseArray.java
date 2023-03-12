package gfg.alphaDsaSheet;

/* https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/ */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {};
//        reverse(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        recursiveRverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // Iterative way. TC O(n)
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // recursive way. TC O(n)
    public static void recursiveRverse(int[] arr, int start, int end) {
        if (start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
