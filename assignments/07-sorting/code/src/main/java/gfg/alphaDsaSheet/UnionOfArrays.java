package gfg.alphaDsaSheet;

/* https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1 */

import java.util.Arrays;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
//        System.out.println(doUnion(a, a.length, b, b.length));
        System.out.println(doUnionOptimised(a, a.length, b, b.length));
    }

    // modified binary search -> TC O((m+n)logn)
    public static int doUnionOptimised(int a[], int n, int b[], int m) {
        int count = n;
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            int index = binarySearch(a, 0, n - 1, b[i]);
            if (index == -1) {
                count++;
            }
        }
        return count;
    }

    public static int binarySearch(int[] a, int start, int end, int bValue) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (a[mid] == bValue) {
                return mid;
            } else if (a[mid] > bValue) {
                return binarySearch(a, start, mid - 1, bValue);
            } else {
                return binarySearch(a, mid + 1, end, bValue);
            }
        }
        return -1;
    }

    // two pointer approach O(nlogn+mlogm)
    public static int doUnion(int a[], int n, int b[], int m) {
        //Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, count = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                count++;
                i++;
            } else if (a[i] > b[j]) {
                count++;
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        while (i < a.length) {
            count++;
            i++;
        }
        while (j < b.length) {
            count++;
            j++;
        }
        return count;
    }
}
