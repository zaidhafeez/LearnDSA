package com.lecture.sorting;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {10,15,-5,-30,-3,-12};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {


                if(arr[j] < arr[j -1]) swap(arr, j, j-1);
                swapped = true;

            }

            if(!swapped) break;

        }

    }

    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - 1 - i;

            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);

        }

    }


    static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0 ; j--) {

                if(arr[j] < arr[j - 1]) swap(arr, j, j -1);
                else break;

            }

        }


    }

    static int getMaxIndex(int[] arr, int i, int last) {

        int max = 0;

        for (int j = 1; j <= last ; j++) {

            if (arr[max] < arr[j]) max = j;

        }

        return max;
    }

    static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
