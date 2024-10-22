// calculate the power of given number

package com.DataStructures.Recursion;

public class Question_10 {

    public static int Pow(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number * Pow(number, power - 1);
    }

    public static int opimizedPower(int number, int power) {
        if (power == 0) {
            return 1;
        }
        int halfpower = opimizedPower(number, power/2);
        int halfpowsq = halfpower * halfpower;

        if (power % 2 != 0) {
            halfpowsq =  number * halfpowsq;
        }

        return halfpowsq;
    }

    public static void main(String[] args) {
        System.out.println(Pow(2,5));
        System.out.println(opimizedPower(2,5));
    }
}
