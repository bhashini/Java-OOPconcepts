package com.busyqa.coursework.wk4_answer;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Collections {

    /*
     * This program reads the file named "colors.txt", which resides in the
     * "src/main/resources" folder in this project. That file contains colour names
     * that are populated into an String ArrayList. (Already coded)
     *
     * Once the ArrayList is populated, remove all the elements that are
     * repeated(Hint: Use a Set)
     *
     * Sort the Arraylist (prefer an algorithm with a low Time and Space Complexity).
     * Find using binarySearch() and print to the console the position for the element
     * "Blue" in the ArrayList.
     */

    public List<String> readFile() {

        List<String> list = new ArrayList<>();

        /*
         * The try-with-resources statement is a try statement that declares one
         * or more resources. A resource is an object that must be closed after
         * the program is finished with it. The try-with-resources statement
         * ensures that each resource is closed at the end of the statement. Any
         * object that implements java.lang.AutoCloseable, which includes all
         * objects which implement java.io.Closeable, can be used as a resource.
         */

        try( BufferedReader br = new BufferedReader(new InputStreamReader(getClass().
                              getClassLoader().getResourceAsStream("colors.txt")));){
            /* Reads the file from the resources folder of the project. */

            String line;
            while ((line = br.readLine()) != null) {
                list.addAll(Arrays.asList(line.split(",")));
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Error with the file: " + e.getMessage());
        }

        return list;
    }


    public static void main(String[] args) {

        List<String> list = new Collections().readFile();
        
        /* Add your solution here. */

        java.util.Collections.sort(list); // since the class name is Collections, here we have to use full class name of the java build in Collections class
        			//otherwise it will give an error. If the class name is like CollectionsClass or some thing we can straightly use Collections.sort(list) method
        
        System.out.println(java.util.Collections.binarySearch(list, "Blue"));
       
    }

}
