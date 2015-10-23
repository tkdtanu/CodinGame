package com;

import java.util.Scanner;

public class PrimeDemo {
	
	public static boolean isPrime(int num){
		if(num==1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static int addPrime(int primeArray[]){
		int sum=0;
		for(int num:primeArray){
			if(isPrime(num)){
				sum+=num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(-5));
		System.out.println(isPrime(31));
		
		int primeArray[]={1,3,2,5,7,9,11,17,23,25,24,60,31};
		System.out.println("Sum of All prime numbers is: "+PrimeDemo.addPrime(primeArray) );

	}

}
