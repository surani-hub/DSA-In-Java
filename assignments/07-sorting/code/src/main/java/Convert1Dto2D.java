import java.util.Arrays;


public class Convert1Dto2D {
    public static void main(String[] args) {
//        int[] original = {1, 2};
//        int m = 1, n = 1;

//        int[][] twoD = construct2DArray(original, m, n);
//        for (int[] oneD : twoD) {
//            System.out.println(Arrays.toString(oneD));
//        }

        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        int r = 2, c = 4;

        int[][] twoD = matrixReshape(mat, r, c);
        for (int[] oneD : twoD) {
            System.out.println(Arrays.toString(oneD));
        }
    }

    /* https://leetcode.com/problems/convert-1d-array-into-2d-array/ */
    static public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != (m * n)) {
            return new int[][]{};
        }
        int[][] newArr = new int[m][n];

        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newArr[index++][0] = original[index++];
            }
        }
        return newArr;
    }

    /* https://leetcode.com/problems/reshape-the-matrix/description/?envType=study-plan&id=data-structure-i */
    static public int[][] matrixReshape(int[][] mat, int r, int c) {

        if ((mat.length * mat[0].length) != (r * c)) {
            return mat;
        }
        int row =0;
        int col = 0;
        int[][] oneD = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                oneD[row][col] = mat[i][j];
                col++;
                if(col==c){
                    row++;
                    col =0;
                }
            }
        }
        return oneD;
    }
}
