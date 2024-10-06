// Decimal Number to Binary

package com.Basic_Java.Assignment3;

public class Question_2 {
    public static int DecimalToBinary(int Decimal){

        int Binary = 0;
        int power = 0;

        while (Decimal > 0){
            int remainder = Decimal % 2;
            Binary = (int) (Binary + (remainder * Math.pow(10, power)));
            Decimal /= 2;
            power++;
        }

        return Binary;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToBinary(2));
    }
}
