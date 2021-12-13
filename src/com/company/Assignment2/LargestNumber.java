package com.company.Assignment2;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("the largest number is: " + ((num1 > num2) ? num1 : num2));

    }

}
