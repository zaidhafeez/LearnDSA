package com.lecture.linearSearch;

import java.util.Arrays;

public class Q5_SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
            {23,4,1},
            {18,12,39},
            {78,99,34,56},
            {18,12}
        };

        int target = 56;

        System.out.println(Arrays.toString(searching(arr, target)));


    }


    static int[] searching(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++){

            for (int column = 0; column < arr[row].length ; column++) {

                if(arr[row][column] == target) return new int[]{row,column};

            }

        }

        return new int[]{-1,-1};


    }
}
