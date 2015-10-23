package com;

import java.util.Scanner;

public class ReverseWordfromLasttofirst {
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String t[]=S.split(" ");
        for(int i=t.length-1;i>=0;i--){
            System.out.print(t[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
	}

}
