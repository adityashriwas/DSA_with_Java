// Que 3: How many times a given digit is occurring in a number.

package com.ASSIGNMENTS.Assignment2;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        System.out.print("Enter the digit to count occurrence : ");
        int digit = sc.nextInt();
        while(number > 0){
            int rem = number % 10;
            if (rem == digit){
                counter++;
            }
            number = number / 10;
        }
        System.out.println("count of occurrence is: "+counter);
    }
}
