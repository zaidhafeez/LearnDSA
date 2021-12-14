package com.company.Assignment4;

import java.util.Scanner;

public class PrintPrime {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        System.out.print("The Prime Number are:");
        for(int number = 1; number < 1000; number++){

            if(isPrime(number)) System.out.print(" " + number);
        }
    }

    static boolean isPrime(int number) {

        if(number <= 1) return false;

        int count = 2;

        while(count * count <= number){

            if (number % count == 0) return false;
            count++;

        }

        return true;

    }

}
