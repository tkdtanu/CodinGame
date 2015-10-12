package com;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class NumberSort {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();int value[]=new int[N];
        for (int i = 0; i < N; i++) {
            value[i] = in.nextInt();
        }
        Arrays.sort(value);
        for(int i=0;i<N;i++){
            System.out.print(value[i]);
            if(i!=N-1)
            System.out.print(" ");
        }
    }
}