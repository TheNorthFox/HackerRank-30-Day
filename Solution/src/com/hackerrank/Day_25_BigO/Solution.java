package com.hackerrank.Day_25_BigO;
/**

Task
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number,n , 
determine and print whether it's Prime or Not prime.

Note: If possible, try to come up with a O(sq of n) primality algorithm, or see what sort of optimizations 
you come up with for an O(n) algorithm. Be sure to check out the Editorial after submitting your code!

Input Format

The first line contains an integer, T, the number of test cases.
Each of the T subsequent lines contains an integer, n, to be tested for primality.

Constraints
	1<=T<=30
	1<=n<=2x10^9

Output Format

For each test case, print whether n is Prime or Not prime on a new line.

Sample Input

3
12
5
7
Sample Output

Not prime
Prime
Prime

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        for(int i =0; i<num; i++){
            int n = scan.nextInt();
            System.out.println(isPrime(n)? "Prime" : "Not prime");
        }
       
        scan.close();
    }
    
       static boolean isPrime(int n){

        if(n<2){
            return false;
            }
           
        for(int i = 2; i*i <=n; i ++){
            
            if(n%i == 0){
                return false;
            }

        } 
                return true;
                 
}
}

