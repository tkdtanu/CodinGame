package com;import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String S=t.toUpperCase();
        System.err.println(S);
        Map<String, String> m1=new HashMap<String, String>();
            m1.put("A" , "4");
    m1.put("B" , "8");
    m1.put("C" , "(");
    m1.put("D" , "|)");
    m1.put("E" , "3");
    m1.put("F" , "|=");
    m1.put("G" , "6");
    m1.put("H" , "|-|");
    m1.put("I" , "!");
    m1.put("J" , "_|");
    m1.put("K" , "|<");
    m1.put("L" , "1");
    m1.put("M" , "/\\/\\");
    m1.put("N" , "|\\|");
    m1.put("O" , "0");
    m1.put("P" , "|>");
    m1.put("Q" , "9");
    m1.put("R" , "/2");
    m1.put("S" , "5");
    m1.put("T" , "7");
    m1.put("U" , "|_|");
    m1.put("V" , "\\/");
    m1.put("W" , "\\/\\/");
    m1.put("X" , "}{");
    m1.put("Y" , "'/");
    m1.put("Z" , "2");
    for(int i=0;i<S.length();i++){
        String abc=(String) m1.get((S.charAt(i))+"");
        if(abc!=null){
            System.out.print(abc);
        }
        else{
            System.out.print(S.charAt(i));
        }
    }
    }
}