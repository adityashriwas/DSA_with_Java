// Que 4: Input a number and print all the factors of that number (use loops).

package com.Basic_Java.Assignment2;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find factors: ");
        int number = sc.nextInt();
        int iterator = 1;
        while(iterator <= (number/2)){
            if (number % iterator == 0){
                System.out.print(iterator + " ");
            }
            iterator++;
        }
    }
}
