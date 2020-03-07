package com.algorithms_datastructures.arrays_strings;


import javax.swing.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {

    private HashMap<Integer, String> hashMap;

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "kishore");
        hashMap.put(2, "divya");
        hashMap.put(3, "roja");
        hashMap.put(4, "ashoka");
        hashMap.put(5, "karthik");

        System.out.println("iterating hashmap with for loop");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries) {
            System.out.print(entry.getKey()); System.out.println(entry.getValue());
        }

        System.out.println("iterating hashmap with while loop");
        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            System.out.print(mapElement.getKey()); System.out.println(mapElement.getValue());
        }



    }
}


