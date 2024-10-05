// check if a number is even or odd
// whenever a number is & by 1, if number's LSB is 0 it returns 0
// and if number's LSB is 1 it returns 1
package com.DataStructures.BIT_Manipulation;

public class EvenOrOdd {

    public static void checkEvenOrOdd(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        checkEvenOrOdd(3);
        checkEvenOrOdd(12);
        checkEvenOrOdd(45);
    }
}
