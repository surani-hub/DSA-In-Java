package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsequences {
    static Integer count;

    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 1, 4};
        printSub(arr);
    }

    static public void printSub(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        List<Integer> subsequence = new ArrayList<>();
        collectSubsequence(0, arr, subsequence);
        System.out.println("=======================================");

//        List<List<Integer>> ans = new ArrayList<>();
//        printSubsequence(0, arr, subsequence, ans);
//        System.out.println(ans);
//        System.out.println("=================================");
//
//        count = 0;
//        countSubsequence(0, arr, subsequence, count);
//        System.out.println("count is " + count);
//        System.out.println("=======================================");
//        Arrays.sort(arr);
//        List<List<Integer>> ans = new ArrayList<>();
//        printUniqueSubsequence(0, arr, subsequence, ans);
//        System.out.println(ans);
//        System.out.println("=================================");
    }

    // printing all subsequences
    public static void collectSubsequence(int index, int[] arr, List<Integer> subsequence) {
        if (index == arr.length) {
            System.out.println(subsequence);
            return;
        }
        subsequence.add(arr[index]);
        collectSubsequence(index + 1, arr, subsequence);
        subsequence.remove(subsequence.size() - 1);
        collectSubsequence(index + 1, arr, subsequence);
    }

    // counting all subsequences
    public static void countSubsequence(int index, int[] arr, List<Integer> subsequence, int count) {
        if (index == arr.length) {
            count++;
            return;
        }
        subsequence.add(arr[index]);
        countSubsequence(index + 1, arr, subsequence, count);
        subsequence.remove(subsequence.size() - 1);
        countSubsequence(index + 1, arr, subsequence, count);
    }

    // collecting all the subsequences
    public static void printSubsequence(int index, int[] arr, List<Integer> subsequence, List<List<Integer>> ans) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(subsequence));
            return;
        }
        subsequence.add(arr[index]);
        printSubsequence(index + 1, arr, subsequence, ans);
        subsequence.remove(subsequence.size() - 1);
        printSubsequence(index + 1, arr, subsequence, ans);
    }

    // collecting all the subsequences without repetition
    public static void printUniqueSubsequence(int index, int[] arr, List<Integer> subsequence, List<List<Integer>> ans) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(subsequence));
            return;
        }
        subsequence.add(arr[index]);
        printUniqueSubsequence(index + 1, arr, subsequence, ans);
        while (index + 1 < arr.length && arr[index] == arr[index + 1]) {
            index++;
        }
        subsequence.remove(subsequence.size() - 1);
        printUniqueSubsequence(index + 1, arr, subsequence, ans);
    }


}
