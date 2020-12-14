package com.algorithms_datastructures.aaa_iterationsOnDataStructures;

import java.util.*;
public class IterationsOnDataStructures {

    public static void main(String[] args) {

        //differences between forloop and forEachloop
        int[] arr = {5,4,8,6,2,4,5,9,7};
        System.out.println("iterating arrau using forLoop");
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
        }
        System.out.println("iterating array using forEachLoop");
        for( int key:arr) {
            //  System.out.println(key);
        }
        System.out.println("iterating array using while Loop"); //whileLoop is complicated with array
        int v=0;
        while(v<=8){
            //System.out.println(arr[v]);
            v=v+1;
        }

          ArrayList<Integer> arrlist = new ArrayList<Integer>();
      arrlist.add(14);
      arrlist.add(7);
      arrlist.add(39);
      arrlist.add(40);

         /* For Loop for iterating ArrayList */
      System.out.println("For Loop");
      for (int counter = 0; counter < arrlist.size(); counter++) { 		      
          System.out.println(arrlist.get(counter)); 		
      } 
        
          /* Advanced For Loop*/ 		
      System.out.println("Advanced For Loop"); 		
      for (Integer num : arrlist) { 		      
           System.out.println(num); 		
      }
       
         /*Looping Array List using Iterator*/
      System.out.println("Iterator");
      Iterator iter = arrlist.iterator();
      while (iter.hasNext()) {
         System.out.println(iter.next());
      }
        //----------------------------------------------------------------------
        //Hashmap iterations
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "kishore");
        hashMap.put(2, "divya");
        hashMap.put(3, "roja");
        hashMap.put(4, "ashoka");
        hashMap.put(5, "karthik");

        System.out.println("iterating hashmap with for loop");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry: entries) {
            // System.out.print(entry.getKey()); System.out.println(entry.getValue());
        }

        System.out.println("iterating hashmap with while loop");
        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)iterator.next();
            // System.out.print(mapElement.getKey()); System.out.println(mapElement.getValue());
        }

        //hashMap iterations using custom dataType
        HashMap<String, List<Employee>> hashMapEmployee  = new HashMap<String, List<Employee>>();

        List<Employee> list1 = new ArrayList<>();

        Employee employee = new Employee();
        employee.setFirstName("Kishore");
        employee.setLastName("maroju");

        Employee employee2 = new Employee();
        employee2.setFirstName("ravi");
        employee2.setLastName("Banglore");

        list1.add(employee);
        list1.add(employee2);

        List<Employee> list2 = new ArrayList<>();

        Employee employee3 = new Employee();
        employee3.setFirstName("vasavi");
        employee3.setLastName("karumanchi");

        Employee employee4 = new Employee();
        employee4.setFirstName("digvijay");
        employee4.setLastName("singh");

        list2.add(employee3);
        list2.add(employee4);

        hashMapEmployee.put("teamEagleYe", list1);
        hashMapEmployee.put("alphaTeam", list2);

        for (Map.Entry<String, List<Employee>> entry : hashMapEmployee.entrySet()) {
            String key = entry.getKey();
            List<Employee> values = entry.getValue();
            System.out.println("Team Name:"+ key);
            for (int i = 0; i<values.size(); i++) {
                System.out.println("Employee First Name:" + values.get(i).getFirstName());
                System.out.println("Employee Last  Name:" + values.get(i).getLastName());
                System.out.println();
            }

        }

    }
}


class Employee {
    private String FirstName;
    private String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }



}

