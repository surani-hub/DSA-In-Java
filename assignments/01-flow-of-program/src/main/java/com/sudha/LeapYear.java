package com.sudha;

import java.util.Scanner;

/*
    1. Input a year and find whether it is a leap year or not.
*/
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input year: ");

        System.out.println(isLeap(in.nextInt()));
    }

    // checking input year is leap or not
    static boolean isLeap(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        return false;
    }
}
