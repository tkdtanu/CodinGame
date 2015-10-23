package com;
import java.util.*;
class Solution {public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=1){
            System.out.print(n+" ");if(n%2==0){n=n/2;}else{n=n*3+1;}       
        }
        System.out.print(1);
    }
}