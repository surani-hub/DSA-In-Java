package gfg.alphaDsaSheet;
/* https://practice.geeksforgeeks.org/problems/arranging-the-array1131/1 */
import java.util.Arrays;

public class ArrangeArrayWithOrder {
    public static void main(String[] args) {
        long N = 4;
        long[] arr = {-3, 3, -2, 2};
        rearrange(arr, N);
        System.out.println(Arrays.toString(arr));
    }

    static public void rearrange(long a[], long n) {
        // Your code goes here
        long i = 0, j = 0;
        while (j < a.length) {
            if (a[(int) j] >= 0) {
                j++;
            } else {
                for (int k = (int) j; k > i; k--) {
                    long temp = a[ k];
                    a[k] = a[k - 1];
                    a[k - 1] = temp;
                }
                i++;
                j++;
            }
        }
    }
}
