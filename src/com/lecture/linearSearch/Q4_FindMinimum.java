package com.lecture.linearSearch;

public class Q4_FindMinimum {

    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        System.out.println(findMinimum(arr));

    }

    static int findMinimum(int[] arr){

        if(arr.length == 0) return Integer.MIN_VALUE;

        int min = arr[0];

        for (int num : arr) {

            if(num < min) {
                min = num;
            }

        }

        return min;

    }

}
