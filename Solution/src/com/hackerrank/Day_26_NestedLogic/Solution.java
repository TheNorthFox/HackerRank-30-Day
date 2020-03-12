package com.hackerrank.Day_26_NestedLogic;
/**

Task
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). 
The fee structure is as follows:

	If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
	If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 Hackos x (the number of days late).
	If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine = 500 Hackos x (the number of days late).
	If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
	
Input Format

The first line contains 3 space-separated integers denoting the respective day, month, and year on which the book was actually returned.
The second line contains 3 space-separated integers denoting the respective day, month, and year on which the book was expected to be returned (due date).

Constraints
	1<=D<=31
	1<=M<=12
	1<=Y<=3000
	It's guranteed that the dates will be valid Gregorian calendar dates.

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015
Sample Output

45

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        int da = scan.nextInt();
        int ma = scan.nextInt();
        int ya = scan.nextInt();    
        int de = scan.nextInt();
        int me = scan.nextInt();
        int ye = scan.nextInt();
        
        
        int fine;
        if(ya>ye) {
            fine = 10000;
        }
        else if(ya<ye) {
            fine = 0;
        }
        else if(ma > me) {
            fine = 500*(ma-me);
        }
         else if(ma<me) {
            fine = 0;
        }
        else if(da > de) {
            fine = 15*(da-de);
        }
       
        else{
            fine = 0;
        }
 
       System.out.println(fine);

       scan.close();
        
    }
}

