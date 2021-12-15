package com.company.Assignment4;

import java.util.Scanner;

public class FindGrade {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int marks = in.nextInt();

        System.out.println("The Grade is: " + getGrade(marks));

    }

    // You Can Use AND (&&) operator too.
    // if(marks>90 && marks <=100) like this

    static String getGrade(int marks) {

        if(marks > 90) return "AA";
        else if(marks > 80) return "AB";
        else if(marks > 70) return "BB";
        else if(marks > 60) return "BC";
        else if(marks > 50) return "CD";
        else if(marks > 40) return "DD";
        else return "Fail";



    }

}
