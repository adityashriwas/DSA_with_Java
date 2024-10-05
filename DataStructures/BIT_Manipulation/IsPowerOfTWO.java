package com.DataStructures.BIT_Manipulation;

public class IsPowerOfTWO {
    public static boolean isPower(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPower(15));
    }
}
