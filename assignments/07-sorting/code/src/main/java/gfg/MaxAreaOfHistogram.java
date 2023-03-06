package gfg;

import java.util.Stack;

public class MaxAreaOfHistogram {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }

    static public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }

        stack = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            maxArea = Math.max(maxArea, (height * width));
        }
        return maxArea;
    }
}
