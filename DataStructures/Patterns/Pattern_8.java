// Butterfly pattern

package com.DataStructures.Patterns;

public class Pattern_8 {
    public static void main(String[] args) {
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= ((num*2)-(i*2))  ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= ((num*2)-(i*2))  ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
