// Convert Binary number to decimal

package com.ASSIGNMENTS.Assignment3;

public class Question_1 {

    public static int BinaryToDecimal(int Binary){

        int decimal = 0;
        int power = 0;

        while (Binary > 0){
            int remainder = Binary % 10;
            decimal = (int) (decimal + (remainder * Math.pow(2, power)));
            Binary /= 10;
            power++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(BinaryToDecimal(111 ));
    }
}
