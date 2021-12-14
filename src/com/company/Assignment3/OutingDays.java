package com.company.Assignment3;

public class OutingDays {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 31; i++) {

            if(i % 2 == 0){
                count++;
            }

        }

        System.out.println("No of days he goes out in the month of August: " + count);
    }

}
