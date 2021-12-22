package com.company.Assignment5;

public class CheckEvenDigits {

    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        int res = findNumbers(nums);

        System.out.println(res);


    }

    static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(isEvenDigits(nums[i])) count++;
        }

        return count;

    }

    static boolean isEvenDigits(int num) {

        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        return (count % 2 == 0);

    }
}
