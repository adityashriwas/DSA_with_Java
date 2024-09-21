// Que 5: Take integer inputs till the user enters 0 and print the largest number from all.

package com.ASSIGNMENTS.Assignment2;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int max = 0;
        System.out.println("Enter the numbers: ");
        do{
            n = sc.nextInt();
            if (n > max){
                max = n;
            }
        }while(n != 0 );
        System.out.println("the largest number is: "+ max);
    }
}
