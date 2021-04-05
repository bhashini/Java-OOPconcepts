package com.busyqa.coursework.wk3_answer;

import java.util.Scanner;

import com.google.common.util.concurrent.ExecutionError;

/*
 *  Instructions:
 *  
 *  You are required to compute the power of a number by implementing a calculator.         
 *  Create a class MyCalculator that consists of a single method long power(int, int).     
 *  This method takes two integers, n and p, as parameters and finds the value of n 
 *  to the power of p.                                                                                   
 *  If either n or p is negative, then the method must throw an exception which says        
 *  "n or p should not be negative". Also, if both n and p are zero, then the method        
 *  must throw an exception which says "n and p should not be zero".                        
 *                                                                                          
 *  For example, -4 and -5 would result in java.lang.Exception: n or p should not be        
 *  negative.                                                                               
 *                                                                                          
 *  Complete the function power in class MyCalculator and return the appropriate result     
 *  after the power operation or an appropriate exception as detailed above.
 *  
 */

/*  
 * You are required to compute the power of a number by implementing a calculator.
 *  Create a class MyCalculator that consists of a single method declared as,
 *     long power(int, int).
 *  This method takes two integers, n and p, as parameters, and finds the value of n
 *  to the power of p.
 *  If either n or p is negative, then the method must throw an exception, which says
 *  "n or p should not be negative". If both n and p are zero, then the method
 *  must throw an exception which says "n and p should not be zero".
 *
 *  For example, -4 and -5 would result in java.lang.Exception: n or p should not be
 *  negative.
 *
 *  Complete the function power in class MyCalculator and return the appropriate result
 *  after the power operation or the appropriate exception as detailed above.
 */

//**** try to use try catch block within the MyCalculator class ****

class MyCalculator {
	/*
	 * Create the method long power(int, int) here.
	 */

	void power(int n, int p)   {
		long pwr = 1;

    
		
		try {
			if (n < 0 || p < 0) {
				throw new Exception("n or p should not be negative");
			} else if (n == 0 && p == 0) {
				throw new Exception("n and p should not be zero");
				
			} else {
				pwr = (long)Math.pow(n, p);
				System.out.println(pwr);
				
			}
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	
	}		
			
//		if (n < 0 || p < 0) {
//			throw new Exception("n or p should not be negative");
//		} else if (n == 0 && p == 0) {
//			throw new Exception("n and p should not be zero");
//			
//		} else {
//			pwr = (long)Math.pow(n, p);
//		}
//		return pwr;
//	}

	/*
	 * Hint:
	 * 
	 * It's possible to create an Exception with the following code: throw new
	 * Exception("here goes your customized message");
	 */
}

public class ExceptionGeneration {

	public static final MyCalculator myCalculator = new MyCalculator();
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter n: ");
		int n = in.nextInt();

		System.out.print("\nEnter p: ");
		int p = in.nextInt();

		//try {
			System.out.println(n + " " + p);
			/* Uncomment this once you have create created the method. */
			//System.out.println(myCalculator.power(n, p));
			myCalculator.power(n, p);
		//} catch (Exception e) {
			//System.out.println(e);
		//}

	}
}