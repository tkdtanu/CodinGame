package com;

import java.util.Scanner;

public class CubeNo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();int i=1;
        int a=1;
        while(a<=n){
        	i++;
        	a+=i;
        	
        }
        System.out.println(i-1);
        if((a-n-i)>=0)
        System.out.println(a-n-i);
        else
        	System.out.println(i-(a-n));
	}

}
