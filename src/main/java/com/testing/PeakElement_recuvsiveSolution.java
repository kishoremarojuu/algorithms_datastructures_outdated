package com.testing;

public class PeakElement_recuvsiveSolution {
    // Driver method
    public static void main (String[] args)
    {
        int arr[] = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is " +
                findPeak(arr, n));
    }

    private static int findPeak(int[] arr, int n) {
       return findpeakUtil(arr, 0, arr.length-1);
    }

    private static int findpeakUtil(int[] arr, int start, int end) {



        int mid= (start+end)/2;

        if (arr[mid - 1] <= arr[mid] || arr[mid] < arr[mid+1]) {
            return mid;

        }else if(arr[mid-1]>arr[mid]){
            return findpeakUtil(arr, start, mid-1);

        }else{
            return  findpeakUtil(arr,mid+1, end);
        }


    }


}