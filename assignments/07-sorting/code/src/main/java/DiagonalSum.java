/* https://leetcode.com/problems/matrix-diagonal-sum/description/ */
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {4, 5, 6, 4},
                {7, 8, 9, 4},
                {10, 11, 12, 4}};
        System.out.println(diagonalSum(mat));
    }

    static public int diagonalSum(int[][] mat) {
        int n = mat.length - 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += mat[i][i] + mat[n - i][i];
        }
        if ((n + 1) % 2 != 0) {
            return sum - mat[n / 2][n / 2];
        }
        return sum;
    }
}
