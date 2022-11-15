/*
	Write a program to print following pattern?
	 	
	    *
	   ***
	  *****
	 *******
	*********
*/

import java.util.Scanner;

public class Pattern05{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}