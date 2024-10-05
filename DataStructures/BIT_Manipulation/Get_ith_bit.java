package com.DataStructures.BIT_Manipulation;

public class Get_ith_bit {

    public static int get_ith_bit(int n, int i){
        int bitmask = 1 << i;
        if ((n & bitmask) == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(get_ith_bit(15, 2));
        System.out.println(get_ith_bit(15,4));
    }
}
