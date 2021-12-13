package com.company.Assignment1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        System.out.println("The Multiplication Table is:");
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(num + " * " + i + " = " + (num * i));

        }

    }

}
