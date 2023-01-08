import java.util.Arrays;

/* https://leetcode.com/problems/squares-of-a-sorted-array/ */
public class SquaresArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static public int[] sortedSquares(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int n = arr.length;
        int res[] = new int[n];

        while (left <= right) {
            int leftSum = arr[left] * arr[left];
            int rightSum = arr[right] * arr[right];

            if (leftSum > rightSum) {
                res[--n] = leftSum;
                left++;
            } else {
                res[--n] = rightSum;
                right--;
            }
        }
        return res;
    }
}
