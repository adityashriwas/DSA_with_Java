package com.DataStructures.BIT_Manipulation;

public class Clear_range_of_bits {

    public static int clearRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearRange(10,2,4));
    }
}
