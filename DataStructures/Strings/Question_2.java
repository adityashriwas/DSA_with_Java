// Shortest path

package com.DataStructures.Strings;

import java.util.*;
public class Question_2 {

    public static float shortestPath(String str){
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'W'){
                x--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            }else {
                continue;
            }
        }
        return (float) Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
