// Que 3: Take 2 numbers as input and print the largest number.

package com.Basic_Java.Assignment1;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            System.out.println(num1+" is greater number");
        }
        else if(num2 > num1){
            System.out.println(num2+" is greater number");
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
}
