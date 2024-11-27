package com.btcag.bootcamp.week3;

import java.util.Scanner;

public class ByRef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Was willst du verdoppeln?");
        i = input.nextInt();

        doubleValue(i);
    }

    public static void doubleValue(int i) {
        i *= 2;
        System.out.println(i);
    }
}
