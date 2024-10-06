// Que 8: Check if the number is Perfect Number or not.

package com.Basic_Java.Assignment2;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        int iterator = 1;
        while(iterator <= (number/2)){
            if (number % iterator == 0){
                sum += iterator;
            }
            iterator++;
        }
        System.out.println(sum);
        if (sum == number){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a perfect number!");
        }
    }
}
