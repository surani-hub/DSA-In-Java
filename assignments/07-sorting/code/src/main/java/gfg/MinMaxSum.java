package gfg;

import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        minMax(arr);
    }

    static public void minMax(int[] arr){
        int minSum = arr[0];
        int maxSum = arr[0];

        long sum = Arrays.stream(arr).sum();

        for(int num: arr){
            if(num < minSum){
                minSum = num;
            }else if(num > maxSum) {
                maxSum = num;
            }
        }
        System.out.println((sum - maxSum) + " " + (sum-minSum));
    }
}
