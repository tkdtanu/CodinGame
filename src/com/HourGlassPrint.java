package com;
import java.util.*;
class Solution {
	public static void hourglass(int a, char ctr, int b) {
		if (b == a) {
			return;
		}
		int patternLength = 0;
		int mid = (a + 1) / 2;
		if (b < mid) {
			patternLength = a - (b * 2);
		} 
		else {
			patternLength = 2 * (b - mid + 1) + 1;
		}
		char[] whitespace = new char[(a - patternLength)/2];
		Arrays.fill(whitespace, ' ');
		char[] pattern = new char[patternLength];
		Arrays.fill(pattern, ctr);
		System.out.println(new String(whitespace) + new String(pattern));
		hourglass(a, ctr, b + 1);
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int a=S.length(),count=0;
		char ctr = S.charAt(0);
		hourglass(a, ctr, 0);
	}
}