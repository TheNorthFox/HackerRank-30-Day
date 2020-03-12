package com.hackerrank.Day_6_Review;
/**
Task
Given a string, S , of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).

Note: 0 is considered to be an even index.

Input Format

The first line contains an integer, T (the number of test cases).
Each line i of the T subsequent lines contain a String,S .

Constraints
	1<=T<=10
	2<=length of S <= 10000
	
Output Format

For each String Sj (where 0<=j<=T-1), print Sj's even-indexed characters, followed by a space, followed by Sj's odd-indexed characters.

Sample Input

2
Hacker
Rank
Sample Output

Hce akr
Rn ak

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for (int tc = 0; tc < T; tc++) {
            String S = sc.nextLine();

            printEveryOtherCharacters(S, 0);
            System.out.print(" ");
            printEveryOtherCharacters(S, 1);
            System.out.println();
        }

        sc.close();

        // String t = scan.nextLine();
        // char[] array = t.toCharArray();
        
        
        // for(int i=0; i<t.length(); i++) {
        //     System.out.print(array[i]);
        //     i++;
        // }
        // System.out.print(" ");
        
        // for(int i=1; i<t.length(); i++) {
        //     System.out.print(array[i]);
        //     i++;
        // }
        // scan.close();
    }

    static void printEveryOtherCharacters(String s, int beginIndex) {
        for (int i = beginIndex; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }
}

