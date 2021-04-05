package com.busyqa.coursework.wk3_answer;

/*
 * Instructions:
 * 
 * Write the following code in your editor below:
 * 1. A class named Arithmetic with a method named add that takes integers as 
 * parameters and returns an integer denoting their sum. 
 * 2. A class named Adder that inherits from a superclass named Arithmetic.
 * 
 */

/*
 * Write your code here!!!
 */

class Arithmetic
{
	public int add(int a,int b)
	{
		return (a+b);
	}
}
class Adder extends Arithmetic
{

}

public class Inheritance{
		
  public static void main(String []args){
      /* 
       * Create a new Adder object
       * Uncomment the following lines once Class Adder is created.
       */
	  
      Adder a = new Adder();
      
      // /*Print the name of the superclass on a new line*/
      System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
      
      // /*Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:*/
      System.out.printf("%d %d %d %n",a.add(10, 32),a.add(10, 3),a.add(10, 10));
     // System.out.printf(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
   }
}

