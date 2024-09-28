package com.DataStructures.Patterns;

public class Pattern_14 {

    public static void printPattern(int n){
        for (int i = 1; i <= 2 * n ; i++) {
            int totalcolinrow = i > n ? 2 * n - i: i;
                for (int j = 1; j <= totalcolinrow ; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}