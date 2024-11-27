package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein");
        long zahl = input.nextLong();
        long divider = 2;

        System.out.print("Die Zahl " + zahl + "kann in folgende Faktoren zerlegt werden: ");
        while (zahl > 1) {
            while (zahl % divider == 0) {
                System.out.print(divider + ", ");
                zahl = zahl / divider;
            }
            divider++;
        }
    }
}
