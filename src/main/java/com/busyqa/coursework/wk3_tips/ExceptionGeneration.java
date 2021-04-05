package com.busyqa.coursework.wk3_tips;
import java.util.Scanner;

/*
 *  Instructions:
 *
 *  You are required to compute the power of a number by implementing a calculator.
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
 *
 */

/*
 * In a Java file is possible to have many classes but only one can be public.
 * The name of the java file will the same as the public class.
 */

class MyCalculator {

    long power(int n, int p) throws Exception{

        long pwr = 1;

        if ((n==0) || (p==0)) {
           throw new Exception("n and p should not be zero");
        } else if ((n<0) || (p<0)) {
           throw new Exception("n or p should not be negative");
        }


        for (int i=0;i<p; i++) {
            pwr *= n;
        }

        return pwr;
    }
}

public class ExceptionGeneration {

    static MyCalculator myCalculator = new MyCalculator();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter n: ");
        int n = in.nextInt();

        System.out.print("\nEnter p: ");
        int p = in.nextInt();

        try {

            System.out.printf("%n%d to the power of %d is: %d %n",n,p,myCalculator.power(n,p));
            /*
             * System.out.printf
             *
             * %n : new line
             * %d : placeholder that represents a number
             *
             * The first %d is replaced by n, the second %d is replaced by p, and so on.
             */

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
