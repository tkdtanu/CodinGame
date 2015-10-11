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
        int p=0,q=0,r=0,s=0;
        
        int arr[][]=new int[N][2];
        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            arr[i][0]=x;
            arr[i][1]=y;
        }
       int minx= Math.abs(arr[0][0]-arr[1][0]);
       int miny= Math.abs(arr[0][1]-arr[1][1]);
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(Math.abs(arr[i][0]-arr[j][0])<minx && Math.abs(arr[i][1]-arr[j][1])<miny){
                    p=arr[i][0];
                    q=arr[j][0];
                    r=arr[i][1];
                    s=arr[j][1];
                }
            }
        }
        System.out.println(p+" "+q);
        System.out.println(r+" "+s);
    }
}