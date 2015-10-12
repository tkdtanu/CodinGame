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
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String t = in.next();
            int a=0,b=0;
            for(int j=0;j<t.length();j++){
                if(j<=2){
                    a+=Integer.parseInt(t.charAt(j)+"");
                }
                else{
                    b+=Integer.parseInt(t.charAt(j)+"");
                }
            }
            if(a==b)
            System.out.println("true");
            else
            System.out.println("false");
        }

    }
}