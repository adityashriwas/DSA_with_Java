//Que 3: Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.ASSIGNMENTS.Assignment1;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();
        System.out.print("Enter the Rate: ");
        double rate = sc.nextDouble();

        double SI = (principal * time * rate)/100;
        System.out.println("The SI is " + SI);
    }
}
