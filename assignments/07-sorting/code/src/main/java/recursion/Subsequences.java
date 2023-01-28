package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    static Integer count;
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSub(arr);
    }

    static public void printSub(int[] arr){
        if(arr.length == 0){
            return;
        }

        List<Integer> subsequence = new ArrayList<>();
        collectSubsequence(0, arr, subsequence);
        System.out.println("=======================================");

        List<List<Integer>> ans = new ArrayList<>();
        printSubsequence(0, arr, subsequence, ans);
        System.out.println(ans);
        System.out.println("=================================");

        count = 0;
        countSubsequence(0, arr, subsequence, count);
        System.out.println("count is " + count);
    }

    // printing all subsequences
    public static void collectSubsequence(int index, int[] arr, List<Integer> subsequence) {
        if(index == arr.length){
            System.out.println(subsequence);
            return;
        }
        subsequence.add(arr[index]);
        collectSubsequence(index+1, arr, subsequence);
        subsequence.remove(subsequence.size()-1);
        collectSubsequence(index+1, arr, subsequence);
    }

    // counting all subsequences
    public static void countSubsequence(int index, int[] arr, List<Integer> subsequence, int count) {
        if(index == arr.length){
            count++;
            return ;
        }
        subsequence.add(arr[index]);
        countSubsequence(index+1, arr, subsequence, count);
        subsequence.remove(subsequence.size()-1);
        countSubsequence(index+1, arr, subsequence, count);
    }

    // collecting all the subsequences
    public static void printSubsequence(int index, int[] arr, List<Integer> subsequence, List<List<Integer>> ans) {
        if(index == arr.length){
            ans.add(new ArrayList<>(subsequence));
            return ;
        }
        subsequence.add(arr[index]);
        printSubsequence(index+1, arr, subsequence, ans);
        subsequence.remove(subsequence.size()-1);
        printSubsequence(index+1, arr, subsequence, ans);
    }


}
