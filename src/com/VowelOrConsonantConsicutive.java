package com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelOrConsonantConsicutive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String t=sc.nextLine();
		String s=t.toLowerCase();
		String ptr="*.(?!.*[aeiou]{2}.*).*.(?!.*[a-z&&^aeiou]{2}.*).*";
		Pattern p=Pattern.compile(ptr);
		Matcher m=p.matcher(s);
		if(m.find()){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
		
	}
	

}
