package com.hackerrank.Day_23_BST_LevelOrderTraversal;
/**

Task
A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right,
top to bottom. You are given a pointer, root, pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.

Hint: You'll find a queue helpful in completing this challenge.

Input Format

The locked stub code in your editor reads the following inputs and assembles them into a BST:
The first line contains an integer,T  (the number of test cases).
The T subsequent lines each contain an integer,data , denoting the value of an element that must be added to the BST.

Output Format

Print the data value of each node in the tree's level-order traversal as a single line of N space-separated integers.

Sample Input

6
3
5
4
7
2
1
Sample Output

3 2 5 1 4 7 

*/

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
 
static void levelOrder(Node root){
      //Write your code here
      Queue<Node> queue = new LinkedList<Node>();
     
      queue.add(root);
        while (!queue.isEmpty()) {
            Node head = queue.remove();

            if (head == null) {
                continue;
            }

            System.out.print(head.data + " ");

            queue.add(head.left);
            queue.add(head.right);
        }
        System.out.println();
      
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}