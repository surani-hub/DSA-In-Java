public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-1};
        System.out.println(maxSubArray(arr));
    }

    static public int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }
            currentSum += arr[i];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
