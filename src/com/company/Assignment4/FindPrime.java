package com.company.Assignment4;

import java.util.Scanner;

public class FindPrime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println("The number is prime? " + isPrime(number));

    }

    static boolean isPrime(int number) {

        if (number <= 1) return false;
        int count = 2;
        while (count * count <= number){

            if(number % count == 0) return false;

            count++;

        }

        return true;

    }

}
