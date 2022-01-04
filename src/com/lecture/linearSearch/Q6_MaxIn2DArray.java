package com.lecture.linearSearch;

import java.util.Arrays;

public class Q6_MaxIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,39},
                {78,99,34,56},
                {18,12}
        };

        System.out.println((findMax(arr)));
    }

    static int findMax(int[][] arr) {

        int max = arr[0][0];

//        for (int row = 0; row < arr.length; row++){
//
//            for (int column = 0; column < arr[row].length ; column++) {
//
//                if(arr[row][column] > max){
//
//                    max = arr[row][column];
//
//                }
//
//            }
//
//        }

        for (int[] row:arr) {

            for (int element: row) {

                if(element > max){

                    max = element;

                }

            }

        }


        return max;

    }

}
