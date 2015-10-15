package com;
import java.util.*;
import java.util.regex.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Test 	 {

    public static void main(String args[]) {import java.util.*;
    class Solution {

        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            in.nextLine();int sum=0;
            for (int i = 0; i < N; i++) {
                String line = in.nextLine();
                sum+=Integer.parseInt((line.charAt(i)+""))+Integer.parseInt((line.charAt(line.length()-i-1)+""));
            }
            System.out.println(sum);
        }
   

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("answer");
    
}