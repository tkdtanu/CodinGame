package com;

import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if((x1+x2)%2==0){
            System.out.print((x1+x2)/2+" ");
        }else{
            System.out.print(((float)(x1+x2)/2)+" ");
        }
        if((y1+y2)%2==0){
            System.out.println((y1+y2)/2);
        }else{
            System.out.println((float)(y1+y2)/2);
        }
    }
}