package com.sudha;

import java.util.Scanner;

/*
    5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
*/
public class SumAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;
        do{
            System.out.println("Enter a number");
            num = in.nextInt();
            sum += num;
        }while(num != 0 );
        System.out.println(sum);
    }
}
