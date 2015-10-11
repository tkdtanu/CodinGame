package com;

import java.util.*;
class Solution {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String S1=S.toUpperCase();
		String s1="OLZEASGTBQ";
		String s2="0123456789";
		for(int i=0;i<S.length();i++){
			if(!s1.contains(S1.charAt(i)+"")){
				System.out.print(S.charAt(i));
			}else{
				System.out.print(s2.charAt(s1.indexOf(S1.charAt(i))));
			}
		}
	}
}