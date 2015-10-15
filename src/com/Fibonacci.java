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
        int N = in.nextInt();
        if(N==1){
            System.out.println(0);
        }else if(N==2){
            System.out.println(0+" "+1);
        }else{
        int febCount = N;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++){
                 System.out.print(feb[i]);
                 if(i!=febCount-1){
                     System.out.print(" ");
                 }
         }
        }
//- See more at: http://java2novice.com/java-interview-programs/fibonacci-series/#sthash.TU7LuWm1.dpuf
    }
}