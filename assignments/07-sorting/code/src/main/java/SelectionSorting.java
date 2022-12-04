import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selection(arr);
        System.out.println("Ascending order " + Arrays.toString(arr));

        selectionReverse(arr);
        System.out.println("Descending order " + Arrays.toString(arr));
    }

    static public void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static public int getMaxIndex(int[] arr, int start, int end) {
        int index = start;
        for (int i = start; i <= end; i++) {
            if (arr[index] < arr[i]) {
                index = i;
            }
        }
        return index;
    }

    static public void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static public void selectionReverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int first = i;
            int minIndex = getMinIndex(arr, i, arr.length-1);
            swap(arr, minIndex, first);
        }
    }
    static public int getMinIndex(int[] arr, int start, int end){
        int index = start;
        for(int i=start; i<=end; i++){
            if(arr[i] > arr[index]){
                index = i;
            }
        }
        return index;
    }
}
