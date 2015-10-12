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
        String duration = in.next();
        int hour=Integer.parseInt(duration.substring(0,2));
        
        int min=Integer.parseInt(duration.substring(3,5));
        int sum=hour*60+min;
        System.out.println(sum);
    }
}