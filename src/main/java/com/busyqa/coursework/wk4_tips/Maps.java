package com.busyqa.coursework.wk4_tips;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Maps {

    /*
     * This program reads the file named "pairs.txt", which resides in the
     * "src/main/resources" folder in this project. The file contains pairs of values
     * id(Integer) and name(String) that are populated into an HashMap. (Already coded)
     *
     * Goal: Print on the console the all elements of HashMap sorted by the Key.
     * Hint: This can be achieved by moving the entries of the HashMap to an ArrayList.
     *       Then sort the ArrayList by the key.
     *       The other more efficient way is with a TreeMap, which is like a Map but
     *       sorted by the keys. TreeMaps were not covered in this course, so it may
     *       require to do a small research.
     *       You will find both solutions below.
     * Note: You can omit some steps of the proposed solutions by using the appropriate
     * methods. Nevertheless, these solutions follow a step-by-step approach to keep
     * things clear.
     */

    /*
     * The method below reads the file and generates a Map.
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
         * Solution #1 - Using a List to sort the entries by Key.
         */
        System.out.println("Solution #1");

        /*
         * Reads the file and creates a Map.
         */
        Map<Integer,String> map = new Maps().readFile();

        /*
         * Converts the Map into a Set of entries.
         * Note.- A Map is comprised of key-value pairs (entries).
         */
        Set<Entry<Integer, String>> set = map.entrySet();

        /*
         * Converts the Set into a List.
         */
        List<Entry<Integer, String>> list = new ArrayList<>();
        for(Entry<Integer, String> entry: set) {
            list.add(entry);
        }

        /*
         * Sort the list by Key using the Comparator class.
         * Note.- Here we call the Collections class including the name of the package (java.util)
         * to avoid conflicts with the customized class Collections we have in this package.
         */
        java.util.Collections.sort(list,new Comp());

        /*
         * Prints the sorted List.
         */
        for(Entry<Integer, String> entry: list) {
            System.out.printf("K: %3d | V: %s%n",entry.getKey(),entry.getValue());
            /*
             * System.out.printf()
             *
             * %n  : new line.
             * %3d : placeholder that represents a number with 3 digits.
             * %s  : placeholder that represents a string.
             *
             * The %3d placeholder is replaced by entry.getKey(), the %s is replaced by entry.getValue()).
             */
        }

        /*
         * Solution #2 - Using a TreeMap.
         */
        System.out.println("\nSolution #2");

        /*
         * Create a TreeMap using the original map.
         * Note.- TreeMap automatically sorts the Map by Key.
         */
        SortedMap<Integer,String> treeMap = new TreeMap<>(map);

        /*
         * Prints the TreeMap.
         */
        for(Entry<Integer, String> entry: treeMap.entrySet()) {
            System.out.printf("K: %3d | V: %s%n",entry.getKey(),entry.getValue());
        }
    }
}

/*
 * The Comp class is used to compare two entries by their keys.
 */
class Comp implements Comparator<Entry<Integer, String>>{

    @Override
    public int compare(Entry<Integer, String> entry0, Entry<Integer, String> entry1) {
        return entry0.getKey().compareTo(entry1.getKey());
    }
}
