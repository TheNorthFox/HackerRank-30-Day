package com.hackerrank.Day_4_Class_Instance;
/**
Objective
In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept, it's only enabled in certain languages. Check out the Tutorial tab for learning materials and an instructional video!

Task
Write a Person class with an instance variable,age , and a constructor that takes an integer,intialAge , as a parameter. 
The constructor must assign intialAge to age after confirming the argument passed as intialAge is not negative; 
if a negative argument is passed as , the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:

yearPasses() should increase the age instance variable by 1.
amIOld() should perform the following conditional actions:
If age<13, print You are young..
If age>=13 and age<18, print You are a teenager..
Otherwise, print You are old..
To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method. Don't worry if you don't understand it all quite yet!

Note: Do not remove or alter the stub code in the editor.

*/



public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
          
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
           if (age < 13) {
                System.out.println("You are young.");
            }
             else if(age >=13 && age < 18) {
                System.out.println("You are a teenager.");
            } 
            else {
                System.out.println("You are old.");
        }
            
	}

	public void yearPasses() {
  		// Increment this person's age.
          age++;

	}
}

