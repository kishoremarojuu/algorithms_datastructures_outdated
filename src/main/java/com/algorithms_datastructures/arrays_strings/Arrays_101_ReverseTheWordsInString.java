package com.algorithms_datastructures.arrays_strings;

public class Arrays_101_ReverseTheWordsInString {
    public static void main(String args[] ) throws Exception {
        String input = "Wherever you go you can always find beauty";
        System.out.println(reversetheWordsInString(input));
    }

    public static String reversetheWordsInString(String str){
        int n = str.length();
        String[] split = str.split(" ");

        String output = "";
        for(int i=split.length-1;i>=0; i--){
            //System.out.println(split[i]);
          output = output+ " "+ split[i];


        }
        return output;

    }



}