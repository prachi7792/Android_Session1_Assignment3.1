
package com.acadgild.javaassignment3_1.core;
 

		// TODO Auto-generated method stub
		public class CompilingOutput{
			 static{
			 print(10);
			 }
			 static void print(int x){
			 System.out.println(x);
			 System.exit(0);
			 }
			 }

		
// correct option is C


// explanation  only with in jdk 1.6:
//This program will run, print a message and terminate gracefully.
//The runtime system needs to load the class before it can look for the main method.
//So the static initializer will run first and print "10".
//Immediately after that System.exit(0) will be called
//it will terminate the program before an error can be thrown.
------------------------------------------------------------------------------
//explanation after 1.7 and 1.8 
//In 1.7 or above it will throw "main method not found please write public static void main(String args[])
//to get the answer." 
//explanation: after 1.7 version of jdk this option is not avaliable as the changes that made 
//java language are standardize and without main method we can't run our code.


