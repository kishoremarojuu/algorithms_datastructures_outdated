package com.algorithms_datastructures;

import javax.sound.midi.Soundbank;

public class SortingAlgo_107_SortedMatrixSearch {


    public static void main(String[] args) {


        int mat[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };



        search(mat, 4, 555);
    }

    private static void search(int mat[][], int n, int x) {

        int i=0; int j=n-1;

        while(i<n && j>=0){
        if(mat[i][j]==x){
            System.out.println("Element found");
            return;
        }else if(mat[i][j]>x){
            j--;
        }else if(mat[i][i]<x){
            i++;
        }
        }

        System.out.println("Element not found");
        return;

    }
}
