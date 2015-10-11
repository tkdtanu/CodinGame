package com;

import java.util.*;class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int HP1 = in.nextInt();int D1 = in.nextInt();int HP2 = in.nextInt();int D2 = in.nextInt();int count=0;while(HP1>0 && HP2>0){HP1-=D2;HP2-=D1;
            count++;
        }
        if(HP1>0){
            System.out.println(1+" "+(count));
        }else{
            
            System.out.println(2+" "+(count));
        }
    }
}
