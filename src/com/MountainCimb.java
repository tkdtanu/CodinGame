package com;

import java.util.Scanner;

public class MountainCimb {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();char arr[][]=new char[height][width];
        for (int i = 0; i < height; i++) {
            String mountainRow = in.next();
            arr[i]=mountainRow.toCharArray();
        }
        
        int count=0,temp=0,check=0;
        for (int i=height-1;i>=0; i--) {
			for (int j = temp; j <width ; j++) {
				if(arr[i][j]=='#' && (i!=0 && arr[i-1][j]!='#') ){
						temp=j;
						count++;
						break;
					
				}
				if(i==0 || arr[i-1][j]=='#'){
					check=1;
				}
				
			}
			if(check==1){
				break;
			}
			
		}
		System.out.println(count);
    }

}
