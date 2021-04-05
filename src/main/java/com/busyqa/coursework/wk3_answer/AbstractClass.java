package com.busyqa.coursework.wk3_answer;

import java.util.*;

/*
 * Instructions:
 *  
 * You have to create another class called MyBook(in this file) that extends the 
 * Book abstract class. 
 * Notice that setTitle method in the Book class is abstract and has no body. 
 * That means you must implement the body of this method in the child class.
 * In the editor, we have provided the abstract Book class and a Main class. 
 * In the Main class, we've created an instance of a class called MyBook. 
 * Your task is to write just the MyBook class.
 * Your class mustn't be public.
 * 
 */

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book
{
	@Override
	void setTitle(String s)
	{
		this.title = s;
	}
}

/*
 * Write MyBook class here!!!
 */

public class AbstractClass{
	
	@SuppressWarnings("unused")
	public static void main(String []args){
		
		System.out.print("Enter a Title: ");
		
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		
		/*
		 * Uncomment the following chunk of code once you have created MyBook class
		 */
		
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("\nThe title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}