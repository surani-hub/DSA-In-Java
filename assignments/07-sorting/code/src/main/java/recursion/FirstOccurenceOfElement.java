package recursion;

public class FirstOccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 3, 5, 10, 2, 5, 3, 1};
        int target = 1;
        System.out.println(findFirstOccurance(arr, target, 0));
    }

    static public int findFirstOccurance(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return findFirstOccurance(arr, target, i + 1);
    }
}
