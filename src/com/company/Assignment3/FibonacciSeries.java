package com.company.Assignment3;

import java.util.Scanner;

public class FibonacciSeries{

    public static void main(String[] args) {

        int term1 = 0;
        int term2 = 1;
        int term = 0;

        Scanner in = new Scanner(System.in);
        int noOfTerms = in.nextInt();
        int count  = 1;

        while(count <= noOfTerms){

            System.out.print(" " + term1);
            term = term1 + term2;
            term1 = term2;
            term2 = term;

            count++;
        }



    }




}
