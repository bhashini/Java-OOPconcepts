package com.busyqa.coursework.wk4_answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
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

        Map<Integer,String> map = new Maps().readFile();

        //coz Map cannot be iterated over for loop, we have to use Set
       Set<Entry<Integer,String>> set = map.entrySet();
        
        
        /* Write your solution here. */
        
        List<Entry<Integer,String>> list = new ArrayList<>(set);
        java.util.Collections.sort(list, new comparator());

                for(Entry <Integer,String> l : list)
        {
        	System.out.println("K "+l.getKey()+" V "+l.getValue());
        }
        
        


      
       
//     	  System.out.println("Solution 02 using TreeMap");  
//       
//        Map<Integer,String> treemap = new TreeMap<Integer, String>(map);
//       
//        for(Entry<Integer, String> e : treemap.entrySet())
//        {
//        	System.out.printf("K %d  V %s \n",e.getKey(),e.getValue() );
//        }
       
    }
}
