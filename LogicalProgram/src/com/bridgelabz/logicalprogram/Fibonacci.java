package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class Fibonacci
{
    public static void Compute(int n)
    {
        int firstNumber =0,secondNumber =1, counter=0;

        while(counter<n)
        {
            System.out.println( firstNumber + " ");

            int temp = firstNumber + secondNumber;
            firstNumber=secondNumber;
            secondNumber=temp;

            counter++;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the range");
        int n = s.nextInt();
        Compute(n);
    }
}
