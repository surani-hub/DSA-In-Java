package recursion.subsequences;

public class CountSubsequenceSumToK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1};
        int k = 3;
        collectSubsequence(arr, k);
    }

    static public void collectSubsequence(int[] arr, int k) {
        System.out.println(sumToK(0, arr, k, 0));
    }

    // counting all subsequences whose sum is equivalent to givenSum
    public static int sumToK(int index, int[] arr, int k, int sum) {
        if (index == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        sum += arr[index];
        int leftCount = sumToK(index + 1, arr, k, sum);
        sum -= arr[index];
        int rightCount = sumToK(index + 1, arr, k, sum);
        return leftCount + rightCount;
    }
}
