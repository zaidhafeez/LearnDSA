package com.company.Assignment4;

import java.util.Scanner;

public class EligibleVoter {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int age = in.nextInt();

        System.out.println("The voter is eligible? " + isEligible(age));

    }

    static boolean isEligible(int age) {

        return (age >= 18);

    }

}
