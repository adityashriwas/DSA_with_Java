// Que 7: Find if a number is palindrome or not

package com.ASSIGNMENTS.Assignment2;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int ognumber = sc.nextInt();
        int number = ognumber;
        int palindrome = 0;
        while(number > 0){
            int remainder = number % 10;
            palindrome = palindrome * 10 + remainder;
            number /= 10;
        }
        System.out.println(palindrome);
        if (ognumber == palindrome){
            System.out.println("Given number is palindrome");
        }else {
            System.out.println("Given number is not palindrome!");
        }
    }
}
