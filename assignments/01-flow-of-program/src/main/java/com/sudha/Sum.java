package com.sudha;

/*
    2.Take two numbers and print the sum of both.
*/

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input two numbers: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("sum = " + sum);
    }
}
