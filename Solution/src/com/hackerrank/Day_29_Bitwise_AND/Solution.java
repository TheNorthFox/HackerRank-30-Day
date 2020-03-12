package com.hackerrank.Day_29_Bitwise_AND;
/**

Task
Given set S={1,2,3,...,N}. Find two integers, A and B (where A<B), from set S such that the value of A&B is the 
maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.

Input Format

The first line contains an integer,T , the number of test cases.
Each of the T subsequent lines defines a test case as 2 space-separated integers, N and K, respectively.

Constraints
	1<=T<=10^3
	2<=N<=10^3
	2<=K<=N
	

Output Format

For each test case, print the maximum possible value of A&B on a new line.

Sample Input

3
5 2
8 5
2 2
Sample Output

1
4
0

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        
        for (int tItr = 0; tItr < t; tItr++) {
           
            int n = scanner.nextInt();

            int k = scanner.nextInt();

            System.out.println(result(n,k));
        }

        scanner.close();
    }
    static int result(int N, int K){
        int value = 0;
        for(int A =1; A<=N; A++){
            for(int B = A+1; B<=N; B++){
                int temp = A & B;
                if(temp > value && temp < K){
                    value = temp;
                }
            }
        }
        return value;
    }
}




