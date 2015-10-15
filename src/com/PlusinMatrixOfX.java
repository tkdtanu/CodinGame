package com;
import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();char arr[][]=new char[height][width];
        for (int i = 0; i < height; i++) {
            String row = in.next();
            for(int j=0;j<width;j++){
                arr[i][j]=row.charAt(j);
            }
        }
        int sum=0;
        for (int i = 1; i < height-1; i++) {
            
            for(int j=1;j<width-1;j++){
                if(arr[i][j]=='X' && arr[i-1][j]=='X' && arr[i+1][j]=='X'&& arr[i][j-1]=='X' && arr[i][j+1]=='X'){
                    sum++;
                }
                
            }
        }
        System.out.println(sum);
    }
}