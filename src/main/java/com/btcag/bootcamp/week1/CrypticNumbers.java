package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class CrypticNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte die Zahl eingeben");
        long zahl = input.nextLong();

        System.out.println("Bitte Passwort-Zahl eingeben");
        long pw = input.nextLong();

        long result = zahl ^ pw;
        System.out.println("Result: " + result);

        long goBack = result ^ pw;
        System.out.println("Ursprungszahl: " + goBack);
    }
}
