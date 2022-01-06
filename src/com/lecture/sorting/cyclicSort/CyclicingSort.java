package com.lecture.sorting.cyclicSort;

import java.util.Arrays;

public class CyclicingSort {

    public static void main(String[] args) {

//        int[] arr = {5,3,4,1,2};
        int[] arr = {3,1,2};
        cyclicingSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicingSort(int[] arr) {

        int i = 0;
        while (i < arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) swap(arr, i, correctIndex);
            else i++;

        }


    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
