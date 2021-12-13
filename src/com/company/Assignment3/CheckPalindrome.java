package com.company.Assignment3;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number  = in.nextInt();
        int revNumber = 0;

        while(number > revNumber){

            int rem = number % 10;
            revNumber = (revNumber * 10) + rem;
            number /= 10;


        }
//        if((number == revNumber) || (number == revNumber/10)){
//
//            System.out.println("true");
//
//        }
        System.out.println((number == revNumber) || (number == revNumber/10) ? "True":"False");
    }

}
