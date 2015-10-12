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
        String S = in.nextLine();
        String str=S.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(i==0 || str.charAt(i-1)==' ')
            System.out.print((str.charAt(i)+"").toUpperCase());
            else
            System.out.print(str.charAt(i));
        }
    }
}