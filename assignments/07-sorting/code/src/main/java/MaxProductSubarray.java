/* https://leetcode.com/problems/maximum-product-subarray/description/ */
public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 0, 5, 4};
        System.out.println(maxProduct(arr));
    }

    static public int maxProduct(int[] arr) {
        int currMin = arr[0];
        int currMax = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(arr[i], currMax * arr[i]);
            currMin = Math.min(arr[i], currMin * arr[i]);

            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
}
