package com.busyqa.coursework.wk3_tips;

/*
 * Instructions:
 *
 * Write the following code in your editor below:
 * 1. A class named Arithmetic with a method named add that takes two integers as
 *    parameters and returns an integer denoting their sum.
 * 2. A class named Adder that inherits from a superclass named Arithmetic.
 *
 */

class Arithmetic{

    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic{

}

public class Inheritance{

  public static void main(String []args){

      Adder a = new Adder();

      System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

      System.out.printf("%d %d %d %n",a.add(10,32),a.add(10,3),a.add(10,10));
      /*
       * System.out.printf
       *
       * %n : new line
       * %d : placeholder that represents a number.
       *
       * The first %d is replaced by the result of a.add(10,32), and so on.
       */
   }
}

