package gfg;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementToRight {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3, 2};
//        System.out.println(Arrays.toString(findNextGreater(arr)));

        System.out.println(Arrays.toString(findNextGreaterOptimised(arr)));
    }

    // time complexity is O(n)
    static public int[] findNextGreaterOptimised(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    // time complexity is O(n^2)
//    static public int[] findNextGreater(int[] arr) {
//        int[] ans = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            boolean status = false;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < arr[j]) {
//                    ans[i] = arr[j];
//                    status = true;
//                    break;
//                }
//            }
//            if (!status) {
//                ans[i] = -1;
//            }
//        }
//        return ans;
//    }
}
