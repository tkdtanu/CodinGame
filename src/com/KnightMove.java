package com;
import java.util.*;
import java.io.*;
import java.math.*;

class KnightMove {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String pos = in.next();
        int left=0,right=0,up=0,down=0;
        left=pos.charAt(0)-'a';
        right='h'-pos.charAt(0);
        up=pos.charAt(1)-'1';
        down='8'-pos.charAt(1);int count=0;
        if(up>=1 && left>=2){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)-2)+""+(char)(pos.charAt(1)-1));
        	if(count==0){count=1;}
        	
        }
        if(down>=1 && left>=2){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)-2)+""+(char)(pos.charAt(1)+1));
        	if(count==0){count=1;}
        }
        if(up>=2 && left>=1){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)-1)+""+(char)(pos.charAt(1)-2));
        	if(count==0){count=1;}
        }
        if(down>=2 && left>=1){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)-1)+""+(char)(pos.charAt(1)+2));
        	if(count==0){count=1;}
        }
        if(up>=2 && right>=1){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)+1)+""+(char)(pos.charAt(1)-2));
        	if(count==0){count=1;}
        }
        if(down>=2 && right>=1){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)+1)+""+(char)(pos.charAt(1)+2));
        	if(count==0){count=1;}
        }
        if(up>=1 && right>=2){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)+2)+""+(char)(pos.charAt(1)-1));
        	if(count==0){count=1;}
        }
        if(down>=1 && right>=2){
        	if(count!=0){
        		System.out.print(" ");
        		count++;
        	}
        	System.out.print((char)(pos.charAt(0)+2)+""+(char)(pos.charAt(1)+1));
        	if(count==0){count=1;}
        }
        
    }
}