package com.lecture.linearSearch;

public class Q3_SearchInRange {

    public static void main(String[] args) {

        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        System.out.println(findElementInRange(arr,target,1,4));

    }

    static int findElementInRange(int[] arr, int target, int start, int end){

        for (int index = start; index <= end ; index++) {


            if(arr[index] == target) return index;

        }

        return -1;

    }
}
