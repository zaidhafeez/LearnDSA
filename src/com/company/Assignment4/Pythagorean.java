package com.company.Assignment4;

import java.util.Scanner;

public class Pythagorean {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        System.out.println("Is this PythagoreanTriplet? "+isPythagorean(number1,number2,number3));
    }

    static boolean isPythagorean(int number1, int number2, int number3) {

        return squareOf(number1) + squareOf(number2) == squareOf(number3);
    }

    static int squareOf(int number) {

        return number * number;

    }

}
