package com.busyqa.coursework.wk4_tips;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

    /*
     * This program reads the file named "colors.txt", which resides in the
     * "src/main/resources" folder in this project. That file contains colour
     * names that are populated into an String ArrayList. (Already coded)
     *
     * Once the ArrayList is populated, remove all the elements that are
     * repeated. (Hint: Use a Set)
     *
     * Sort the ArrayList (prefer an algorithm with a low Time and Space Complexity).
     * Find using binarySearch() and print to the console the position for the
     * element "Blue" in the ArrayList.
     *
     * Note.- You can omit some steps of the proposed solution by using the appropriate
     * methods. Nevertheless, this solution follows a step-by-step approach to keep
     * things clear.
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

            String line = null;
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

        /*
         * Read the file into a list.
         */
        List<String> list1 = new Collections().readFile();

        /*
         * Convert the list into a set to remove duplicates.
         */
        Set<String> set = new HashSet<>();
        for(String str: list1) {
            set.add(str);
        }

        /*
         * Converts the set back into a list.
         */
        List<String> list2 = new ArrayList<>();
        for(String str: set) {
            list2.add(str);
        }

        /*
         * Before using the binarySearch() method, the list needs to be sorted.
         */
        java.util.Collections.sort(list2);

        /*
         * Binary search the List for the word "Blue"
         */
        int pos = java.util.Collections.binarySearch(list2, "Blue");

        System.out.printf("The position of 'Blue' is: %d ", pos);

        /*
         * Print the List to verify the actual position of "Blue" in the list.
         */
        for(String str: list2) {
            System.out.println(str);
        }
    }

}
