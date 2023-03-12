package gfg.alphaDsaSheet;

/* https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1  intersection of arrays*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};
//        System.out.println(doIntersectionOptimised(a, a.length, b, b.length));
        System.out.println(Arrays.toString(intersection(a, b)));

        System.out.println(doIntersection(a, a.length, b, b.length));
    }

    // modified binary search -> TC O((m+n)logn)
    public static int doIntersectionOptimised(int a[], int n, int b[], int m) {
        int count = 0;
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            int index = binarySearch(a, 0, n - 1, b[i]);
            if (index != -1) {
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

    static public int[] intersection(int[] a, int[] b) {
        int n = a.length, m = b.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(a);
        for (int i = 0; i < m; i++) {
            int index = binarySearch(a, 0, n - 1, b[i]);
            if (index != -1) {
                set.add(a[index]);
            }
        }
        return set.stream().mapToInt(Number::intValue).toArray();
    }

    // two pointer approach O(nlogn+mlogm)
    public static int doIntersection(int a[], int n, int b[], int m) {
        //Your code here
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, count = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        return count;
    }
}
