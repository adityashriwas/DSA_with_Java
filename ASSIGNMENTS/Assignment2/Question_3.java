// Que 3: Subtract the Product and Sum of Digits of an Integer(Leetcode)

package com.ASSIGNMENTS.Assignment2;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int product = 1;
        int sum = 0;
        while(n > 0){
            int remainder = n % 10;
            product = product * remainder;
            sum = sum + remainder;
            n = n / 10;
        }

        int result = product - sum;

        System.out.println(result);

    }
}
