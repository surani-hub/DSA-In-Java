package gfg.alphaDsaSheet;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/* https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/ */
//  order of appearance should not be maintained
public class RearrangeNegativeAndPositiveNumbers {
    public static void main(String[] args) {
        int[] ar = {1, 2, -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1};
//        rearrangeQuickSort(ar);
//        rearrangeTwoPointer(ar);

        rearrange(ar);

        System.out.println(Arrays.toString(ar));
    }

    // partition using quick sort TC-O(n) & SC-O(1)
    public static void rearrangeQuickSort(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    // two pointer approach TC-O(n) & SC-O(1)
    public static void rearrangeTwoPointer(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // left & right positive -> right--
            if (arr[start] >= 0 && arr[end] >= 0) {
                end--;
            }
            // left and right negative -> left++
            if (arr[start] < 0 && arr[end] < 0) {
                start++;
            }
            // left negative and right positive -> left++, right--
            if (arr[start] < 0 && arr[end] >= 0) {
                start++;
                end--;
            }
            // right positive and left negative -> swap, left++, right--
            if (arr[start] >= 0 && arr[end] < 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    // Dutch National Flag Algorithm
    public static void rearrange(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] < 0) {
                low++;
            } else if (arr[high] > 0) {
                high--;
            } else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    }
}
