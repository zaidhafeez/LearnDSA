package com.company.Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);

        int[] nums = {1,3,2,1};
        int[] ans = getConcatenation(nums);

        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {

//            ans[i] = nums[i];
//            ans[i + nums.length] = nums[i];

            ans[i + nums.length] = ans[i] = nums[i];

        }

        return ans;

    }

}
