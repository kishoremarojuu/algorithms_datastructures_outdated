package com.algorithms_datastructures;

// Java program to print all Duplicates in array

import java.util.BitSet;

// A class to represent array of bits using
// array of integers
class SortingAlgo_106_FindDuplicates_UsingJavaBitSetClass
{
    // Main function to print all Duplicates
    static void checkDuplicates(int[] arr)
    {
        BitSet ba1 = new BitSet(320000); //this is the java inBuiltClass

        // Traverse array elements
        for (int i=0; i<arr.length; i++)
        {
            // Index in bit array
            //int num = arr[i] - 1;  ///geeksForGeeksCode

            int num = arr[i];  //myCode

            // If num is already present in bit array
            if (ba1.get(num))
                System.out.print(num +" ");

                // Else insert num
            else
                ba1.set(num);
        }
    }

    // Driver code
    public static void main(String[] args) throws
            Exception
    {
        int[] arr = {5, 5, 5, 10, 12, 10};
        checkDuplicates(arr);
    }
}



