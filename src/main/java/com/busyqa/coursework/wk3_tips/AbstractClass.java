package com.busyqa.coursework.wk3_tips;

import java.util.*;

/*
 * Instructions:
 *
 * You have to create another class called MyBook(in this file) that extends
 * the Book abstract class.
 * Notice that setTitle() method in the Book class is abstract and doesn't
 * have a body. That means you must implement the body of this method in the child class.
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


class MyBook extends Book{

    @Override
    void setTitle(String s) {
        this.title = s;
    }

}

public class AbstractClass{

    public static void main(String []args){

        System.out.print("Enter a Title: ");

        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();


        MyBook novel = new MyBook();
        novel.setTitle(title);
        System.out.println("\nThe title is: " + novel.getTitle());

        sc.close();

    }
}
