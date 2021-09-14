/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = input.nextInt();
        System.out.println("Enter the second number:");
        int second = input.nextInt();
        System.out.println("Enter the third number:");
        int third = input.nextInt();
        int max;
        max = (first > second) ? first : second;
        max = (third > max) ? third : max;
        System.out.printf("The largest number is %d.", max);
    }
}