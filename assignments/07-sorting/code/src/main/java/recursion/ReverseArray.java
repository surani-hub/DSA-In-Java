package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));

        int[] ar = {11,22,33,44,55};
        reverseWithSinglePointer(0, ar);
        System.out.println(Arrays.toString(ar));

    }

    static public void reverse(int left, int right, int[] arr) {
        if (left >= right) {
            return;
        }
        swap(left, right, arr);
        reverse(left + 1, right - 1, arr);
    }

    static public void reverseWithSinglePointer(int i, int[] arr){
        if(i >= (arr.length/2)){
            return;
        }
        swap(i, arr.length-i-1, arr);
        reverseWithSinglePointer(i+1, arr);
    }

    static public void swap(int left, int right, int[] arr){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
