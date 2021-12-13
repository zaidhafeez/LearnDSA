package com.company.Assignment3;

import java.util.Scanner;

public class CheckLeapYear {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        System.out.println((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));



    }

}
