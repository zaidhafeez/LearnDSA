package com.company.Assignment4;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sum = sumOfNNaturalNumbers(number);
        System.out.println("The sum of natural Number is: " + sum);
    }

    static int sumOfNNaturalNumbers(int number) {

        return ((number * (number + 1)) / 2);

    }

}
