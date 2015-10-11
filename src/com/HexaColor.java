package com;
import java.util.*;
class HexaColor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Map<Character,Integer> m1=new HashMap<Character,Integer>();
        m1.put('0',0);
        m1.put('1',1);
        m1.put('2',2);
        m1.put('3',3);
        m1.put('4',4);
        m1.put('5',5);
        m1.put('6',6);
        m1.put('7',7);
        m1.put('8',8);
        m1.put('9',9);
        m1.put('A',10);
        m1.put('B',11);
        m1.put('C',12);
        m1.put('D',13);
        m1.put('E',14);
        m1.put('F',15);
        System.out.print("#");
        for(int i=1;i<s.length();i++){
            int abc=15-Integer.parseInt((m1.get(s.charAt(i))+""));
            if(abc<9){
                System.out.print(abc);
            }
            else{
                System.out.print(Integer.toString(abc,16).toUpperCase());
            }
        }
    }
}