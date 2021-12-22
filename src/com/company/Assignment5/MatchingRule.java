package com.company.Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchingRule{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ruleKey = "type";
        String ruleValue = "phone";

        List<List<String>> items = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            items.add(new ArrayList<>());

        }

        for (int i = 0; i < items.size(); i++) {

            items.get(i).add(in.next());
            items.get(i).add(in.next());
            items.get(i).add(in.next());


        }

        int count = 0;

        for (int i = 0; i < items.size(); i++) {


            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) count++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) count++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) count++;

        }

        System.out.println(items);
        System.out.println(count);


    }

}
