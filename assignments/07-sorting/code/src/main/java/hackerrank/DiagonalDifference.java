package hackerrank;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(9, 8, 9)
                );
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightSum = 0, leftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    leftSum += arr.get(i).get(j);
                }
                if ((i + j) == (arr.size() - 1)) {
                    rightSum += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(leftSum - rightSum);
    }
}
