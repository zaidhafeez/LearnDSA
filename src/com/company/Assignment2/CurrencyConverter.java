package com.company.Assignment2;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float rupees = in.nextFloat();
        final float USD = 81.06f;

        float rupeesInUSD = (rupees / USD);
        System.out.println("Rupees in dollars: " + rupeesInUSD);

    }

}
