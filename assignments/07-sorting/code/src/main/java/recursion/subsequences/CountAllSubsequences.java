package recursion.subsequences;

import java.util.ArrayList;
import java.util.List;

public class CountAllSubsequences {
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSub(arr);
        System.out.println("Number of subsequences: "+ count);
    }

    static public void printSub(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        List<Integer> subsequence = new ArrayList<>();
        printSubsequence(0, arr, subsequence);
    }

    // count all subsequences
    static public void printSubsequence(int index, int[] arr, List<Integer> subsequence) {
        if (index == arr.length) {
            count++;
            return;
        }
        subsequence.add(arr[index]);
        printSubsequence(index + 1, arr, subsequence);
        subsequence.remove(subsequence.size() - 1);
        printSubsequence(index + 1, arr, subsequence);
    }
}
