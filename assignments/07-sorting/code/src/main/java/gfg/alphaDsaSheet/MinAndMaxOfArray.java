package gfg.alphaDsaSheet;

import java.util.Arrays;

/* https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/ */
public class MinAndMaxOfArray {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 4, 1, 9};
        int[] arr = {1000, 11, 445, 1, 330, 3000};

        System.out.println(findMinAndMax(arr).max + " " + findMinAndMax(arr).min);
        maxAndMin(arr);
    }

    // iterative approach -> TC - O(n) comparisons
    public static void maxAndMin(int[] arr){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num: arr){
//            if(num > max){
//                max = num;
//            }
//            if(num < min){
//                min = num;
//            }
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        System.out.println("max is " + max + " & min is " + min);
    }

    // structure way -> TC - O(n-2) comparisons
    public static Pair findMinAndMax(int[] arr) {
        Pair minMax = new Pair();
        if (arr.length == 1) {
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] > minMax.max){
                minMax.max = arr[i];
            }else if(arr[i] < minMax.min){
                minMax.min = arr[i];
            }
        }
        return minMax;
    }

    static class Pair {
        int min;
        int max;
    }
}
