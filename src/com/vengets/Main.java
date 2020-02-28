package com.vengets;

import com.vengets.hackerrank.DivisibleSumPairs;
import com.vengets.models.Solvable;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> implementation = new HashMap<Integer, String>();
        implementation.put(1,"HackerRank | Implementation | Divisible Sum Pairs | Easy | 10");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to HailStorm\n" +
                "Choose your selection:");

        for (Map.Entry<Integer, String> entry : implementation.entrySet()) {
            System.out.println("(" + entry.getKey() +  ") => " +entry.getValue());
        }

        int choice = scanner.nextInt();
        Solvable solvable = null;
        switch (choice) {
            case 1:
                solvable = new DivisibleSumPairs();
                break;
            default:
                System.out.println("Invalid Selection");
        }
        if(solvable!=null) {
            System.out.println(solvable.problem());
            solvable.solve();
        }

    }
}
