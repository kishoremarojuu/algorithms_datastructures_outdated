package com.algorithms_datastructures.arrays_strings;

public class String_100_ReverseString {

    public static void main(String args[] ) throws Exception {
        System.out.println(reverseString("kishore"));
    }

    public static String reverseString(String str){
        int n = str.length();
        String output ="";
        for(int i=n-1;i>=0;i--){
            output = output+str.charAt(i);
        }
        return output;
    }
}