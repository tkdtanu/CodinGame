package com;

import java.util.ArrayList;
import java.util.List;

public class EvenDemo {
	public int[] findEvenValues(int arr[]){
		List<Integer> evenArr=new ArrayList<Integer>();
		for(int num:arr){
			if(num%2==0){
				evenArr.add(num);
			}
		}
		int evenArray[]=new int[evenArr.size()];
		for(int i=0;i<evenArr.size();i++){
			evenArray[i]=evenArr.get(i);
		}
		return evenArray;
		
	}
	
	public static void main(String[] args) {
		EvenDemo e1=new EvenDemo();
		
		int numbers[]={2,4,3,56,8,22,33,12,44,23,67,45};
		int evenArray[]=e1.findEvenValues(numbers);
		System.out.println("Even numbers are: ");
		for(int num:evenArray){
			System.out.print(num+" ");
		}
		
	}

}
