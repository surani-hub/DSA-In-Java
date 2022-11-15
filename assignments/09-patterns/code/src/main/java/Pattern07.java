/*
	Write a program to print following pattern?
	
	*****
	****
	***
	**
	*
	**
	***
	****
	*****
*/

import java.util.Scanner;

public class Pattern07{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}