package com.busyqa.coursework.wk4_tips;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LambdaExpression {


    /*
     * Copy your solution for the Maps Exercise, but this time print the elements using
     * a lambda expression.
     *
     * Hint: Use the forEach() method of the Map Interface.
     */

     Map<Integer,String> readFile() {

        Map<Integer,String> map = new HashMap<>();

        /*
         * The try-with-resources statement is a try statement that declares one
         * or more resources. A resource is an object that must be closed after
         * the program is finished with it. The try-with-resources statement
         * ensures that each resource is closed at the end of the statement. Any
         * object that implements java.lang.AutoCloseable, which includes all
         * objects which implement java.io.Closeable, can be used as a resource.
         */

        try( BufferedReader br = new BufferedReader(new InputStreamReader(getClass().
                              getClassLoader().getResourceAsStream("pairs.txt")));){
            /*
             * Reads the file from the resources folder in the project.
             */

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] pair = line.split(",");
                if (pair.length==2) {
                   map.put(Integer.valueOf(pair[0]), pair[1]);
                } else {
                   throw new Exception("Pair key must contain two elements");
                }
            }
        } catch (Exception e) {
            System.out.println("Error with the file: " + e.getMessage());
        }

        return map;
    }

    public static void main(String[] args) {

        /*
         * Reads the file and creates a Map.
         */
        Map<Integer,String> map = new LambdaExpression().readFile();

        /*
         * Sorts the Map by Key using a TreeMap.
         * Note.- You can also sort the Map using a List as shown in the
         * Maps Exercise.
         */
        SortedMap<Integer,String> treeMap = new TreeMap<>(map);

        /*
         * Prints the TreeMap using a Lambda Expression.
         */
        treeMap.forEach((k,v)-> System.out.printf("K: %3d | V: %s%n",k,v));
        /*
         * System.out.printf()
         *
         * %n  : new line.
         * %3d : placeholder that represents a number with 3 digits.
         * %s  : placeholder that represents a string.
         *
         * The %3d placeholder is replaced by k, and the %s is replaced by v).
         */
    }

}
