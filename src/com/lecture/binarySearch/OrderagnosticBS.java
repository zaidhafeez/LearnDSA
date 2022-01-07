package com.lecture.binarySearch;

import java.util.Arrays;

public class OrderagnosticBS {

    public static void main(String[] args) {
//        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 12;
        int[] arr = {48,36,20,14,12};

        System.out.println(getIndex(arr,target));
    }

    static int getIndex(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){

            // int middle = (start + end) / 2; // here is one problem Integer is fixed size so we do something to
            // prevent from exception

            int middle = start + (end - start) / 2;
            if(arr[middle] == target) return middle;
            if(isAsc){

                if(target > arr[middle]) start = middle + 1;
                else end = middle - 1;

            }
            else{

                if(target < arr[middle]) start = middle + 1;
                else end = middle - 1;

            }

        }

        return -1;

    }

}
