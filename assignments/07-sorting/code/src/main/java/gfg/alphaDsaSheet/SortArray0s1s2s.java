package gfg.alphaDsaSheet;

import java.util.Arrays;
import java.util.HashMap;

/* https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1 */
public class SortArray0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        int N = 3;
        sort012(arr, N);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // TC O(n) SC O(1)
    public static void sort012Optmised(int[] a, int n) {
        int low = 0, mid = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, mid, low);
                ++low;
                ++mid;
            } else if (a[mid] == 1) {
                ++mid;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                --high;
            }
        }
    }

    // TC O(n) SC O(n) as using HashMap to use the frequency
    public static void sort012(int a[], int n) {
        // code here
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num: a) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int idx = 0;

        for (int i = 0; i <= 2; i++) {
            int count = frequency.get(i);
            while (count != 0) {
                a[idx++] = i;
                count--;
            }
            if (idx == a.length) break;
        }
    }
}
