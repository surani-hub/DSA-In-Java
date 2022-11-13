package com.sudha;

/*
    3. Take a number as input and print the multiplication table for it.
*/

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
    }
}
