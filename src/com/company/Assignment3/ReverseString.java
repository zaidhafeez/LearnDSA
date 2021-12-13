package com.company.Assignment3;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String rev = "";
        int length = name.length();
        int start = 0;
        int end = length - 1;

        for (int i = 0; i < length; i++) {

            rev = name.charAt(i) + rev;


        }

        StringBuilder sb = new StringBuilder("Hello");
//        sb.reverse();
        System.out.println(sb.reverse());


        System.out.println("The Reverse String is: " + rev);

        //  2nd Solution convert the string into char Array and then swap;
//        char[] tempArray = name.toCharArray();
//        int n = 1;
//        while (n <= tempArray.length / 2){
//
//            char temp;
//            temp = tempArray[start];
//            tempArray[start] = tempArray[end];
//            tempArray[end] = temp;
//            start++;
//            end--;
//            n++;
//
//
//        }

    }


}
