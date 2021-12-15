package com.company.Lecture.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        swap(arr, 0, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


}
