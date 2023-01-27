package recursion;

public class CheckingSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));

        System.out.println(isSortedRecursive(arr, 0));
    }

    static public boolean isSortedRecursive(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSortedRecursive(arr, i+1);
    }

    static public boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                continue;
            }
            return false;
        }
        return true;
    }
}
