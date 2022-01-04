package com.lecture.binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 5;
        System.out.println(isElementPresent(arr,target));

    }

    static boolean isElementPresent(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

           // int middle = (start + end) / 2; // here is one problem Integer is fixed size so we do something to
            // prevent from exception

            int middle = start + (end - start) / 2;

            if(arr[middle] == target) return true;
            else if(target > arr[middle]) start = middle + 1;
            else end = middle - 1;
        }

        return false;

    }

}
