package com.company.Assignment3;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrConstant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char character = in.next().toLowerCase().charAt(0);

        System.out.println((character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') ? "vowel" : "constarnt");



    }

}
