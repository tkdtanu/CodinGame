import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String N = in.next();
        for(int i=0;i<N.length();i++){
            int a=Integer.parseInt(N.charAt(i)+"");
            if(a<(9-a)){
                System.out.print(a);
            }else{
                System.out.print(9-a);
            }
        }
    }
}