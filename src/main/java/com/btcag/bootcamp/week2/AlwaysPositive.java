package com.btcag.bootcamp.week2;

import java.util.Scanner;

public class AlwaysPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gib eine negative Zahl ein.");
        int zahl = input.nextInt();

        if (zahl < 0) {
            zahl *= -1;
        }
        System.out.println(zahl + ":)");
    }
}
