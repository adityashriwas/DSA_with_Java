// Que 1: Fibonacci Series

package com.Basic_Java.Assignment2;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("nth temp will be: "+b);
    }
}
