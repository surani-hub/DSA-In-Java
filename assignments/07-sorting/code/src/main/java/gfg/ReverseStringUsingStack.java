package gfg;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reversedString(str));
    }

    public static String reversedString(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
