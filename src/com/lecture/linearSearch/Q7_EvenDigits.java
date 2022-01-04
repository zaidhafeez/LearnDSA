package com.lecture.linearSearch;
/* https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ */
public class Q7_EvenDigits {

    public static void main(String[] args) {

        int[] arr = {12,345,2,6,-7896};
        int count = 0;

        for (int element: arr) {

            int noOfdigitts = findevenNumberOfDigits(element);
            System.out.println(findevenNumberOfDigits(element));
            if(noOfdigitts % 2 == 0) count++;

        }

//        System.out.println(count);




    }

    static int findevenNumberOfDigits(int element) {


//        if(element < 0 ) element *= -1;

        int noOfDigits = 0;
        while(element != 0){
            noOfDigits++;
            element = element/10;


        }

        return noOfDigits;

    }

}
