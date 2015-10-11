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
        int year = in.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                        System.out.println("true");
                else
                        System.out.println("false");
    }
}