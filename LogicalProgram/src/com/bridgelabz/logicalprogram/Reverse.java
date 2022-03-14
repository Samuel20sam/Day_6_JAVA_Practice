package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class Reverse
{
    public static void reverseNumber(int num)
    {
        if (num < 10)
        {
            System.out.println(num);
        }
        else
        {
            System.out.print(num % 10);
            reverseNumber(num/10);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        reverseNumber(num);
    }
}
