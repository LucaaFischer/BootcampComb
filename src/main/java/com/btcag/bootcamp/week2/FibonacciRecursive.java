package com.btcag.bootcamp.week2;

import java.util.Scanner;

public class FibonacciRecursive {
    public static int fibOne = 0;
    public static int fibTwo = 1;
    public static int result = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welche Fibonacci-Zahl willst du haben?");

        int n = input.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {

        if (n > 0) {
            result = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = result;
            fibonacci(n - 1);
        }
        return result;
    }
}
