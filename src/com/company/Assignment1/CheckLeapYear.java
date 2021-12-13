package com.company.Assignment1;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){

            System.out.println("leap year");

        }
        else {

            System.out.println("Not a leap year");
        }

    }
}
