package com.company.Assignment4;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();

        System.out.println("The product of two number is : " + getProduct(number1, number2));

    }

    static int getProduct(int number1, int number2) {

        return number1 * number2;

    }

}
