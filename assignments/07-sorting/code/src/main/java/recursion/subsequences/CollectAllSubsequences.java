package recursion.subsequences;

import java.util.ArrayList;
import java.util.List;

public class CollectAllSubsequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSub(arr);
    }

    static public void printSub(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        List<Integer> subsequence = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        collectSubsequence(0, arr, subsequence, ans);
        System.out.println(ans);
    }

    // collecting all the subsequences
    public static void collectSubsequence(int index, int[] arr, List<Integer> subsequence, List<List<Integer>> ans) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(subsequence));
            return;
        }
        subsequence.add(arr[index]);
        collectSubsequence(index + 1, arr, subsequence, ans);
        subsequence.remove(subsequence.size() - 1);
        collectSubsequence(index + 1, arr, subsequence, ans);
    }
}
