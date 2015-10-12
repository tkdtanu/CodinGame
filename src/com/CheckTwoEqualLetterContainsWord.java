package com;
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String t=S.toLowerCase();
        String str[]=t.split(" ");
        int sum=0;
        for(String abc:str){
            int sum1=0;
            for(int i=0;i<abc.length()-1;i++){
                for(int j=i+1;j<abc.length();j++){
                    if(abc.charAt(i)==abc.charAt(j)){
                        sum1=1;
                        break;
                    }
                }
            }
            sum+=sum1;
        }
        System.out.println(sum);
    }
}