package com.company.Assignment5;

import java.util.Arrays;

public class FlipImage{

    public static void main(String[] args) {

//        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int[][] newImage = flipImage(image);

        for (int[] news: newImage) {

            System.out.println(Arrays.toString(news));

        }

//        System.out.println(Arrays.toString());

    }

    static int[][] flipImage(int[][] image) {


        for (int[] row: image) {

            reverse(row);
            invert(row);

        }

        return image;

    }

    static void reverse(int[] row) {

        int start = 0;
        int end = row.length - 1;

        while(start < end){

            swap(row,start,end);
            start++;
            end--;

        }

//        System.out.println(Arrays.toString(row));
    }

    static void swap(int[] row, int start, int end) {

        int temp = row[start];
        row[start] = row[end];
        row[end] = temp;

    }

    static void invert(int[] row) {

        for (int i = 0; i < row.length; i++) {

            if(row[i] == 0) row[i] = 1;
            else row[i] = 0;

        }

    }



}
