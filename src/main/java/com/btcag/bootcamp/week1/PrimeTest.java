package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = input.nextLong();
        int divider = 2;
        boolean prime = true;

        while (divider < zahl) {
            boolean dontSkip = true;
            while (zahl % divider == 0) {
                prime = false;
                divider++;
                dontSkip = false;
            }
            while (dontSkip) {
                dontSkip = false;
                divider++;
            }
        }
        System.out.println("Ergebnis: " + prime);
    }
}
