package com.company.Assignment2;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int usrInput = in.nextInt();

        System.out.println(usrInput % 2 == 0 ? "true" : "false");

    }

}
