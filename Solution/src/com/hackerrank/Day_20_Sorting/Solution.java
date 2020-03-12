package com.hackerrank.Day_20_Sorting;
/**

Task
Given an array, a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm above. 
Once sorted, print the following 3 lines:

	Array is sorted in numSwaps swaps.
		where numSwaps is the number of swaps that took place.
	First Element: firstElement
		where firstElement is the first element in the sorted array.
	Last Element: lastElement
		where lastElement is the last element in the sorted array.
Hint: To complete this challenge, you will need to add a variable that keeps a running tally of all swaps that occur 
during execution.

Input Format

The first line contains an integer,n , denoting the number of elements in array a.
The second line contains n space-separated integers describing the respective values of a0,a1,a2,...,an-1.

Constraints
	2<=n<=600
	1<=ai<=2x10^6, where 0<=i<=n. 
Output Format

Print the following three lines of output:

Array is sorted in numSwaps swaps.
where numSwaps is the number of swaps that took place.
First Element: firstElement
where firstElement is the first element in the sorted array.
Last Element: lastElement
where lastElement is the last element in the sorted array.

Sample Input 0

3
1 2 3
Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3


 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		// Write Your Code Here
		int totalSwaps = 0;
		for (int i = 0; i < n; i++) {
			// Track number of elements swapped during a single array traversal
			int numberOfSwaps = 0;

			for (int j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					numberOfSwaps++;
					totalSwaps++;
				}
			}

			// If no elements were swapped during a traversal, array is sorted
			if (numberOfSwaps == 0) {
				break;
			}


		}

		System.out.println("Array is sorted in " +  totalSwaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n-1]);    

	}


}

