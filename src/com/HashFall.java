package com;import java.util.*;
class HashFall {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();char arr[][]=new char[height][width];
        for (int i = 0; i < height; i++) {
            String line = in.next();
            for(int j=0;j<width;j++){
                arr[i][j]=line.charAt(j);
            }
        }
        for (int i = height-1; i >=0; i--) {
            for(int j=0;j<width;j++){
                if(arr[i][j]=='#'){
                    if(i!=height-1){arr[i][j]='.';}
                    for(int k=i+1;k<height;k++){
                        if(arr[k][j]=='#'){
                            arr[k-1][j]='#';
                            break;
                        }
                        if(k==height-1){
                        	arr[k][j]='#';
                        }
                    }
                }
            }
        }
        for (int i = 0; i < height; i++) {
         //   String line = in.next();
            for(int j=0;j<width;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        
    }
}