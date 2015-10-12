package com;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class AND {

    public static void main(String args[]) {       
        Scanner in = new Scanner(System.in);
        String n1 = in.next();
        String n2 = in.next();
        for(int i=0;i<n1.length();i++){
            if(n1.charAt(i)=='1' && n2.charAt(i)=='1'){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        
        }
    }
}