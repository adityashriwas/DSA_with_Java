package com.DataStructures.BIT_Manipulation;

public class Set_ith_bit {

    public static int set_ith_bit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(set_ith_bit(10, 2));
    }
}
