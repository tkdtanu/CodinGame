package com;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();
		int c=Math.min(a, b);int gcd=0;
		for(int i=1;i<=c;i++){
			if(a%i==0 && b%i==0){
				gcd=i;
			}
		}
		
		System.out.println(gcd);

	}

}
