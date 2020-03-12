package com.hackerrank.Day_16_Exceptions;
/**

Task
Read a string,S , and print its integer value; if S cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. 
If you attempt to use loops/conditional statements, you will get a 0 score.

Input Format

A single string, S.

Constraints
	1<=|S|<=6, where |S| is the length of string S.
 	S is composed of either lowercase letters (a-z) or decimal digits (0-9).
Output Format

Print the parsed integer value of S, or Bad String if S cannot be converted to an integer.

Sample Input 0

3
Sample Output 0

3
Sample Input 1

za
Sample Output 1

Bad String

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int m = Integer.parseInt(S);
            System.out.println(m);

        }
        
        catch(Exception e){
            System.out.println("Bad String");
        }
        in.close();
    }
}


