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
        int n = in.nextInt();int i=0;
        int temp=n;
        for(int k=0;k<temp;k++){
        for(i=0;i<k;i++){
            System.out.print("+");
        }
        for(int j=1;j<=n-k;j++){
            System.out.print(j);
        }
        System.out.println("");
        
        }
        

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("answer");
    }
}