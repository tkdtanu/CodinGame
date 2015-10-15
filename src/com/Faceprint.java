
package com;

import java.util.*;
class Solution {public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String h = in.next();String c = in.next();String e = in.next();String n = in.next();String m = in.next();String cn = in.next();
        System.out.println(h+h+h+h+h+"\n"+c+e+" "+e+c+"\n"+c+" "+n+" "+c+"\n"+c+" "+m+" "+c);
        for(int i=1;i<=(5-cn.length())/2;i++){
            System.out.print(" ");
        } System.out.println(cn);
    }
}