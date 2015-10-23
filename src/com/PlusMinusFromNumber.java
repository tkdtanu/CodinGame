package com;

import java.util.*;
class PlusMinusFromNumber {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String O = in.next();
        int X = in.nextInt();
        String N = in.next();
        int num1=Integer.parseInt(N.substring(0,X));
        int num2=Integer.parseInt(N.substring(X,N.length()));
        if(O.equals("+")){
            if(X==0){
                System.out.println(N);
            }
            else
            System.out.println(num1+num2);
        }
        if(O.equals("-")){
            if(X==0){
                System.out.println("-"+N);
            }
            else
            System.out.println(num1-num2);
        }
        if(O.equals("*")){
            System.out.println(num1*num2);
        }
         if(O.equals("/")){
            System.out.println(num1/num2);
        }
         if(O.equals("%")){
            System.out.println(num1%num2);
        }
    }
}