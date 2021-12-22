package com.company.Assignment5;

import java.util.Arrays;

public class AddToFormInteger {

    public static void main(String[] args) {
//        int[] num = {1,2,0,0};
//        int k = 34;
        // i have to show arr = {1,2,3,4}

//        int[] num = {2,7,4};
//        int k = 181;

        int[] num = {2,1,5};
        int k = 806;

        int[] res = addToArrayForm(num,k);
        System.out.println(Arrays.toString(res));

    }

    static int[] addToArrayForm(int[] num,int k) {

        int i = 1;
        int digit = 0;

        while(i <= num.length){

            digit += num[i - 1] * Math.pow(10, num.length-i);
            i++;


        }

        digit = digit + k;

        int num1 = digit;
        int j = 1;
        int noOfDigits = 0;
        while(num1 != 0){

            num1 /= 10;
            noOfDigits++;


        }

        int[] newArray = new int[noOfDigits];

        while(j <= noOfDigits){



            newArray[j - 1] = (int) (digit/Math.pow(10,noOfDigits - j));
            digit = (int) (digit % Math.pow(10,noOfDigits - j));
            j++;

        }

        return newArray;

    }

}
