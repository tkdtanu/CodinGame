package com;
import java.util.*;
import java.util.regex.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Test 	 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String W = in.next();
        in.nextLine();
        int N = in.nextInt();
        in.nextLine();
        Pattern p=Pattern.compile("["+W+"]");
        
        for (int i = 0; i < N; i++) {
            String area = in.nextLine();int m=0;
            for(int j=0;j<area.length();j++){
            	for(int k=0;k<W.length();k++){
            		if(area.charAt(j)==W.charAt(k)){
            			m++;
            		}
            	}
            }
            System.out.println(m);    
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("answer");
    }
}