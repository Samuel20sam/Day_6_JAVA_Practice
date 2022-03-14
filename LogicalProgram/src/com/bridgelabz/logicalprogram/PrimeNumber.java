package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int i = 2;
        int r = 1;

        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the number");
        int n = s.nextInt();

        while (i < n && r != 0) {
            r = n % i;
            i++;
        }

        if (r == 0)
            System.out.println(n + " is not a Prime Number.");
        else
            System.out.println(n + " is a Prime Number.");
    }
}
