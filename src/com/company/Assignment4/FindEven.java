package com.company.Assignment4;

import java.util.Scanner;

public class FindEven  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println("The number is even?: " + isEven(number));

    }

    static boolean isEven(int number){

        return (number % 2 == 0);

    }

}
