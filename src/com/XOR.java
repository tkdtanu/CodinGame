package com;
import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n1 = in.next();
        String n2 = in.next();
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)==n2.charAt(i)){
                System.out.print(0);
            }else{
                System.out.print(1);
            }
        }
    }
}