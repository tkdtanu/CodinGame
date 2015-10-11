
package com;

import java.io.PrintStream;
import java.util.*;

class CircularList
{

    CircularList()
    {
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        List l1 = new ArrayList();
        for(int i = 1; i <= N; i++)
            l1.add(Integer.valueOf(i));

        int temp = X - 1;
        while(l1.size() > 0) 
        {
            if(temp >= l1.size())
                temp -= l1.size();
            for(; temp < l1.size(); temp += X - 1)
                System.out.println(l1.remove(temp));

        }
    }
}