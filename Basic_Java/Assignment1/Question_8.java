//Que 8: To find Armstrong Number between two given number.

package com.Basic_Java.Assignment1;

import java.util.*;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ognum = num;
        int armstrongnumber = 0;
        while (num != 0){
            int rem = num % 10;
            armstrongnumber += Math.pow(rem, 3);
            num = num/10;
        }
        System.out.println(armstrongnumber);
        if (ognum == armstrongnumber){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
