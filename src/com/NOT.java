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
        String B = in.next();
        for(int i=0;i<B.length();i++){
            if(B.charAt(i)=='0')
            System.out.print(1);
            else
            System.out.print(0);
        }
    }
}