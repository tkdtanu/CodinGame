package com;
import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String DNA = in.next();
        Map m1=new HashMap();//create a map for dna
        m1.put('A','T');
        m1.put('T','A');
        m1.put('C','G');
        m1.put('G','C');
        for(int i=0;i<DNA.length();i++){
            System.out.print(m1.get(DNA.charAt(i)));
        }
    }
}