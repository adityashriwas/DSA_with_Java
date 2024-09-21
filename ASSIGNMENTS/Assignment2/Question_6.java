//Que 6: Factorial Program In Java

package com.ASSIGNMENTS.Assignment2;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number ; i++) {
            mul *= i;
        }
        System.out.println("Factorial of "+number+" is: "+mul);
    }
}
