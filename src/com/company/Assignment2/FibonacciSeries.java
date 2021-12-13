package com.company.Assignment2;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int term1 = 0;
        int term2 = 1;
        int count = 1;
//        int term = 0; // initially term will be zero

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        for (int i = 2; i < n; i++) {
//
////            term = term1 + term2;
////            term1 = term2;
////            term2 = term;
////            System.out.print(" " + term);
//
//
//
//
//        }

        while(count <= n){

            System.out.print(" " + term1);
            int term = term2;
            term2 = term2 + term1;
            term1 = term;

            count++;

        }

    }

}
