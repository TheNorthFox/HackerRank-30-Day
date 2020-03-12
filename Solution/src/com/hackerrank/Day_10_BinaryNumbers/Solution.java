package com.hackerrank.Day_10_BinaryNumbers;
/**

Task
Given a base-10 integer,n , convert it to binary (base-2). Then find and print the base-10 
integer denoting the maximum number of consecutive 1's in n's binary representation.

Input Format

A single integer, n.

Constraints
	1<=n<=10^6

Output Format

Print a single base-10 integer denoting the maximum number of consecutive 1's in the binary 
representation of n.

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2

*/

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        final int n = scanner.nextInt();

        scanner.close();
        final String st = Integer.toString(n,2);

        int counter =0;

        for(final String s: st.split("0")){
            counter = s.length()> counter ? s.length(): counter;
        }
        System.out.println(counter);
    }
}
