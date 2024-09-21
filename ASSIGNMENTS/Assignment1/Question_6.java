// Que 6: Input currency in rupees and output in USD.

package com.ASSIGNMENTS.Assignment1;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in Rupee: ");
        int rupee = sc.nextInt();
        System.out.println("The USD conversion is: "+(0.012 * rupee));
    }
}
