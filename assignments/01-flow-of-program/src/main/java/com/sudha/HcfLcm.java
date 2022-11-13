package com.sudha;

import java.util.Scanner;

/*
    4. Take 2 numbers as inputs and find their HCF and LCM.
*/

public class HcfLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int hcf, lcm;

        int temp1 = num1;
        int temp2 = num2;

        while(temp2 != 0){
            int temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF: "+hcf);
        System.out.println("LCM: "+lcm);
    }
}
