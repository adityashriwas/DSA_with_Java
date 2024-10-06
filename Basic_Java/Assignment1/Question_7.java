// Que 8: To find out whether the given String is Palindrome or not.
package com.Basic_Java.Assignment1;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check: ");
        String str = sc.nextLine();
        int length = str.length() - 1;
        String toCheck = "";
        do{
            toCheck += str.charAt(length);
            length--;
        }while (length >= 0);

        System.out.println(toCheck);

        if (str.equals(toCheck)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not a palindrome string!");
        }
    }
}
