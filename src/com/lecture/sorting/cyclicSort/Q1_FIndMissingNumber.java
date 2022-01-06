package com.lecture.sorting.cyclicSort;

public class Q1_FIndMissingNumber {

    public static void main(String[] args) {

        int[] nums = {0,1};

        System.out.println(missingNumber(nums));

    }

        static int missingNumber(int[] nums) {

            cyclicSort(nums);

            for(int i = 0; i < nums.length; i++){

                if(nums[i] != i) return i;


            }

            return nums.length;


        }

        static void cyclicSort(int[] nums){

            int i = 0;
            while(i < nums.length){

                int correctIndex = nums[i];
                if(nums[i] < nums.length && nums[i] != nums[correctIndex]) swap(nums, i, correctIndex);
                else i++;

            }


        }

        static void swap(int[] nums, int first, int second){

            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;

        }


}
