package com;
import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String t[]=S.split(" ");
        for(int i=0;i<t.length;i++){
            System.out.print(new StringBuilder(t[i]).reverse().toString());
            if(i!=t.length-1){
                System.out.print(" ");
            }
        }
        
    }
}