//Que 1: Write a program to print whether a number is even or odd, also take input from the user.
package com.ASSIGNMENTS.Assignment1;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to check even or odd! ");
        int num =  input.nextInt();
        if (num % 2 == 0 ){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
