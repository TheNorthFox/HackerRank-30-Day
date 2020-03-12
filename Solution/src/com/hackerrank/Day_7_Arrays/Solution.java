package com.hackerrank.Day_7_Arrays;
/**
Task
Given an array,A , of N integers, print 's elements in reverse order as a single line of space-separated numbers.

Input Format

The first line contains an integer, N (the size of our array).
The second line contains  space-separated integers describing array 's elements.

Constraints
	1<=N<=1000
	1<=Ai<=10000, where  is the  integer in the array.
	
Output Format

Print the elements of array A in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1

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
        
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = A.length - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
            
        }
       
        scanner.close();
    }
}
