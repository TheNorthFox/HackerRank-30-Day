package com.hackerrank.Day_9_Recursion;
/**

Task
Write a factorial function that takes a positive integer, N as a parameter and prints the result of N! (N factorial).

Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.

Input Format

A single integer, N (the argument to pass to factorial).

Constraints
	2<=N<=12
	Your submission must contain a recursive function named factorial.
	
Output Format

Print a single integer denoting N!.

Sample Input

3
Sample Output
6

*/


import java.io.*;
import java.util.*;

public class Solution {

	  private static final Scanner scanner = new Scanner(System.in);
    // Complete the factorial function below.
    static int factorial(int n) {       
        if(n==0 || n==1){
            return 1;
        }
        else
        return n*(factorial(n-1));

    }

  

    public static void main(String[] args) throws IOException {
        
    	System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int result = factorial(n);
        System.out.println(n + "! = " + result);

        scanner.close();
    }
}