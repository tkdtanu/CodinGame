package com;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int siteCount = in.nextInt();
        int coupleCount = in.nextInt();
        String sitename[]=new String[siteCount];
        int siteid[]=new int[siteCount];
        String sitemineral[]=new String[siteCount];
        Map
        for (int i = 0; i < siteCount; i++) {
            sitename[i] = in.next();
        }
        for (int i = 0; i < siteCount; i++) {
            siteid[i] = in.next();
            
        }
        for (int i = 0; i < siteCount; i++) {
            sitemineral[i] = in.next();
        }
        for (int i = 0; i < coupleCount; i++) {
            String dataA = in.next();
            String dataB = in.next();
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("result");
    }
}