package com;

import java.util.Scanner;

public class FindWaterArea {
	//Total Area and the length and bredth
	private int[][] TotalArea;
	private static int rowSize;
	private static int colSize;
	

	public FindWaterArea() {
		super();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FindWaterArea fa=new FindWaterArea();
		
		System.out.println("Enter the row size :");
		rowSize=sc.nextInt();
		System.out.println("Enter the column size");
		colSize=sc.nextInt();
		
		System.out.println("Enter '1' for island and '0' for water");
		for(int i=0;i<colSize;i++){
			System.out.println("enter "+rowSize+" elements for "+(i+1)+" row");
			for(int j=0;j<rowSize;j++){
				fa.TotalArea[i][j]=sc.nextInt();
			}
		}
		
		

	}

}
