package com;

import java.util.*;
class MessageDecrypt {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String word = in.nextLine();
        for(char ch:word.toCharArray()){
        	System.err.println(ch);
            int a=ch-N;
            if(a>='a' && a<='z' || a>='A' && a<='Z'){ System.out.print((char)a);}
            if(a<'a' && a>'Z'){ System.out.print((char)('z'-('a'-a)));}
            if(a<'A'){ System.out.print((char)('Z'-('A'-a)));}
        }

        //System.out.println("answer");
    }
}