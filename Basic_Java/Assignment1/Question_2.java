// Que2: Take name as input and print a greeting message for that particular name.

package com.Basic_Java.Assignment1;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String str = sc.nextLine();
        System.out.println("Good wishes to you "+str);

    }
}
