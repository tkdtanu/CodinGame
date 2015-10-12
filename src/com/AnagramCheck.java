package com;
import java.util.*;
import java.util.regex.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String t=S.toLowerCase();int sum=0;
        for(char i='a';i<='z';i++){
            for(int j=0;j<t.length();j++){
                if(i==t.charAt(j)){
                    sum++;break;
                }
            }
        }
        if(sum>=26){
            System.out.println("true");
        }else
        System.out.println("false");
    }
}