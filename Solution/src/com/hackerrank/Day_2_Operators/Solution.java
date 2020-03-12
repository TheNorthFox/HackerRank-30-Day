package com.hackerrank.Day_2_Operators;
/**
 
 Objective
In this challenge, you'll work with arithmetic operators. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!

Input Format

There are 3 lines of numeric input:
The first line has a double,mealCost (the cost of the meal before tax and tip).
The second line has an integer,tipPercent  (the percentage of mealCost being added as tip).
The third line has an integer,taxPercent  (the percentage of mealCost being added as tax).

Output Format

Print the total meal cost, where totalCost is the rounded integer result of the entire bill (mealCost with added tax and tip).
 */


import java.util.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int total_cost = (int)Math.round(meal_cost + meal_cost*tip_percent/100 + meal_cost*tax_percent/100);
        System.out.println("The total meal cost is: " + total_cost);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        

        int tip_percent = scanner.nextInt();
        

        int tax_percent = scanner.nextInt();
        

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}

/*
Day 10 - Binary Numbers
Day 11 - 2D Arrays
Day 12 - Inheritance
Day 13 - Abstract Classes
Day 14 - Scope
Day 15 - Linked List
Day 16 - Exceptions -String to Integer
Day 17 - More Exceptions
Day 18 - Queues and Stacks
Day 19 - Interfaces
Day 20 - Sorting
Day 21 - Generics
Day 22 - Binary Search Trees
Day 23 - BST Level-Order Traversal
Day 24 - More Linked Lists
Day 25 - Running Time and Complexity
Day 26 - Nested Logic
Day 27 - Testing
Day 28 - RegEx Patterns and Intro to DB
Day 29 - Bitwise AND

*/