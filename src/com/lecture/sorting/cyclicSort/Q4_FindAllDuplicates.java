package com.lecture.sorting.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class Q4_FindAllDuplicates {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        cyclicSort(nums);
        System.out.println(getAllDuplicates(nums));

    }

    static List<Integer> getAllDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {


            if(nums[i] != i+1) list.add(nums[i]);

        }

        return list;

    }

    static void cyclicSort(int[] nums) {

        int i = 0;
        while (i < nums.length){

            int correct = nums[i] - 1;

            if(nums[i] != nums[correct]) swap(nums,i,correct);
            else i++;

        }

    }

    static void swap(int[] nums, int first, int second) {

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;


    }

}
