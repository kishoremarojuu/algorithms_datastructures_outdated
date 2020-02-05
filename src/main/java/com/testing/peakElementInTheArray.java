package com.testing;

public class peakElementInTheArray {

    public static void main(String[] args) {
        int[] array = { 15, 20, 25, 35, 45, 50, 60 };
        Integer peak = getPeakElement(array);
        System.out.println(peak != null ? "Peak Element is " + peak : "No peak element!");
    }

    private static Integer getPeakElement(int[] array) {

        if(array==null||array.length==0){
            return null;
        }

        int l=0; int r= array.length-1;



        while(l<=r){
            int mid = (l+r)/2;

          if((array[mid - 1] <= array[mid])  && (mid==array.length-1 || array[mid] >=array[mid + 1])){  //
  //            if ((mid == 0 || array[mid- 1] <= array[mid]) && (mid == array.length - 1 || array[mid] >= array[mid + 1])) {

                    return array[mid];
            }
            else if(array[mid-1]>array[mid]){
                r= mid-1;
            }
            else{
                l = mid+1;
            }


        }

        return  null;
    }


}
