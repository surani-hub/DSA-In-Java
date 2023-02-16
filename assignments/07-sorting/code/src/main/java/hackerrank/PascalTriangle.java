package hackerrank;

import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/pascals-triangle/description/ */
public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    static public List<List<Integer>> generate(int numRows) {
        int[][] ans = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
                }
            }
        }
        List<List<Integer>> finalAns = new ArrayList<>();
        for (int[] r : ans) {
            List<Integer> subList = new ArrayList<>();
            for (int n : r) {
                if (n != 0) {
                    subList.add(n);
                }
            }
            finalAns.add(subList);
        }
        return finalAns;
    }
}
