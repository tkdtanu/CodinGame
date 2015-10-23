package com;

import java.util.Arrays;

public class ArrayAverage {
	
	//find average of an array
	public static double findAverage(int[] arr){
		int sum=0;
		for(int num:arr){
			sum+=num;
		}
		return sum/arr.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{1,2,3,4,5};
		System.out.println("Average of array"+findAverage(array));

	}

}
