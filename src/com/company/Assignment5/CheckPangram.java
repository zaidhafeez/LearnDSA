package com.company.Assignment5;

import java.util.Scanner;

public class CheckPangram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String sentence = in.next();
        sentence = sentence.toLowerCase();

        System.out.println(isPalindrome(sentence));

    }

    static boolean isPalindrome(String sentence) {

        boolean[] alphabets = new boolean[26];

        for (char c: sentence.toCharArray()) {

            alphabets[c - 'a'] = true;

        }

        for (boolean character : alphabets){

            if (!character) return false;

        }

        return true;

    }

}
