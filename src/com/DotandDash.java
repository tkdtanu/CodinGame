package com;
import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            String s=Integer.toBinaryString(X);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='0')
                System.out.print(".");
                else
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}