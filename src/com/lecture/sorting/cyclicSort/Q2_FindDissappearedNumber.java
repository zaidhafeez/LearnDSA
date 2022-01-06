package com.lecture.sorting.cyclicSort;

import java.util.*;

public class Q2_FindDissappearedNumber {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();


        cyclicSort(nums);

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != i + 1) list.add(i+1);


        }

        return list;

    }


    static void cyclicSort(int[] arr){

        int i = 0;
        while (i < arr.length){

            int correct = arr[i] - 1;

            if(arr[i] != arr[correct]) swap(arr,i,correct);
            else i++;

        }


    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }

}
