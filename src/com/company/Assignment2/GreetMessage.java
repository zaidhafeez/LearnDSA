package com.company.Assignment2;

import java.util.Scanner;

public class GreetMessage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();

        System.out.println("Welcome to the bootcamp " + name);

    }

}
