package com;
import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        List l1=new ArrayList();
        Map m1=new HashMap();
        Map m2=new HashMap();
        int yes=0,no=0;
        for (int i = 0; i < N; i++) {
            String personName = in.next();
            int nbVote = in.nextInt();
            l1.add(personName);
            m1.put(personName,0);
            m2.put(personName,nbVote);
            
        }
        for (int i = 0; i < M; i++) {
            String voterName = in.next();
            String voteValue = in.next();
            if(l1.contains(voterName)){
                if(((int)m1.get(voterName))<((int)m2.get(voterName))){
                if(voteValue.equals("Yes")){
                    yes++;
                }else if(voteValue.equals("No")){
                    no++;
                }
                }
                m1.put(voterName,((int)m1.get(voterName)+1));
            }
                
        }
        System.out.println(yes+" "+no);
    }
}