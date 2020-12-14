package com.algorithms_datastructures.aaa_iterationsOnDataStructures.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class SortingList {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

        //looping using java8 streams
        arrlist.stream()
                .sorted()
                .forEach(System.out::println);



    }
}
