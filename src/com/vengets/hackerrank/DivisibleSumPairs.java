package com.vengets.hackerrank;

import com.vengets.algos.MergeSort;
import com.vengets.models.Solvable;

import java.util.Scanner;

public class DivisibleSumPairs implements Solvable {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public String problem() {
        return "https://www.hackerrank.com/challenges/divisible-sum-pairs/problem\n" +
                "Input Format\n" +
                "----- ------\n" +
                "The first line contains 2 space-separated integers, N and K.\n" +
                "The second line contains N space-separated integers describing the values of array[N]\n"+
                "\nOutput Format\n" +
                "------ ------\n" +
                "Print the number of (i,j) pairs where i<j and  a[i]+a[j]  is evenly divisible by K.";
    }

    @Override
    public void solve() {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        System.out.println(result);
    }

    int divisibleSumPairs(int n, int k, int[] ar) {
        new MergeSort().sort(ar, n);

        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
