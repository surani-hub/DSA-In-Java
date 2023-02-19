package hackerrank;

import java.util.ArrayList;
import java.util.List;

/* https://leetcode.com/problems/pascals-triangle-ii/ */
public class PascalTriangleII {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }

    static public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex + 1; i++) {
            ans.add(1);
            for (int j = i - 1; j > 0; j--) {
                ans.set(j, ans.get(j - 1) + ans.get(j));
            }
        }
        return ans;
    }
}
