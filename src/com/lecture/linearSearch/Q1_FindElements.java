package com.lecture.linearSearch;

import java.util.Scanner;

public class Q1_FindElements {

    public static void main(String[] args) {

        int[] arr = {18,12,9,14,77,50};
        int target = 12;

        System.out.println(findElement(arr,target));


    }


    // search the target and return true and false

    static boolean findElement(int[]arr, int target){

        if (arr.length == 0) return false;

        for (int element : arr) {
            if (element == target) return true;

        }

        return false;

    }

    // search the target and return the element
//    static int findElement(int[]arr, int target){
//
//        if (arr.length == 0) return Integer.MIN_VALUE;
//
//        for (int num: arr) {
//
//            if (num == target) return num;
//
//        }
//
//        return Integer.MIN_VALUE;
//
//    }


    // search the target and return the index
//    static int findElement(int[]arr, int target){
//
//        if (arr.length == 0) return -1;
//
//        for (int index = 0; index < arr.length; index++) {
//            int element = arr[index];
//            if(element == target) return index;
//
//        }
//
//        return -1;
//
//    }

}
