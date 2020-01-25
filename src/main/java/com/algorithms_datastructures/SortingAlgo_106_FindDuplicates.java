package com.algorithms_datastructures;

// Java program to print all Duplicates in array
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent array of bits using
// array of integers
class SortingAlgo_106_FindDuplicates
{
    int[] arr;
    // Constructor
    public SortingAlgo_106_FindDuplicates(int n)
    {
        // Devide by 32. To store n bits, we need
        // n/32 + 1 integers (Assuming int is stored
        // using 32 bits)
        arr = new int[(n>>5) + 1];
    }

    // Get value of a bit at given position
    boolean get(int pos)
    {
        // Divide by 32 to find position of
        // integer.
        int index = (pos >> 5);

        // Now find bit number in arr[index]
        int bitNo = (pos & 0x1F);

        // Find value of given bit number in
        // arr[index]
        return (arr[index] & (1 << bitNo)) != 0;
    }

    // Sets a bit at given position
    void set(int pos)
    {
        // Find index of bit position
        int index = (pos >> 5);

        // Set bit number in arr[index]
        int bitNo = (pos & 0x1F);
        arr[index] |= (1 << bitNo);
    }

    // Main function to print all Duplicates
    static void checkDuplicates(int[] arr)
    {
        // create a bit with 32000 bits
        SortingAlgo_106_FindDuplicates ba = new SortingAlgo_106_FindDuplicates(320000);

        // Traverse array elements
        for (int i=0; i<arr.length; i++)
        {
            // Index in bit array
            //int num = arr[i] - 1;  ///geeksForGeeksCode

            int num = arr[i];  //myCode

            // If num is already present in bit array
            if (ba.get(num))
                System.out.print(num +" ");

                // Else insert num
            else
                ba.set(num);
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



