package com;

import java.util.*;
import java.util.regex.*;
class Solution {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		Pattern p=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");
		Matcher m=p.matcher(S);
		if(m.find()){
			System.out.println("true");
			}
		else{
			System.out.println("false");
			}
		}
	}