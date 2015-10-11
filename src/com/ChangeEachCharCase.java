package com;

import java.io.PrintStream;
import java.util.Scanner;

class ChangeEachCharCase
{

    ChangeEachCharCase()
    {
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for(int i = 0; i < S.length(); i++)
            if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')
                System.out.print(Character.toChars(S.charAt(i) + 32));
            else
            if(S.charAt(i) >= 'a' && S.charAt(i) <= 'z')
                System.out.print(Character.toChars(S.charAt(i) - 32));
            else
                System.out.print(S.charAt(i));

    }
}