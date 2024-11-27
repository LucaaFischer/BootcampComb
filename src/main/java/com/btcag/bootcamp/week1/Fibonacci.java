package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int zahl1 = 0;
        int zahl2 = 1;
        int ergebnis = 0;

        System.out.print("Bis zu welcher Zahl soll berechnet werden? ");
        int maxZahl = input.nextInt();

        System.out.print("Fibonacci-Zahlen bis " + maxZahl + ": ");

        while (zahl1 <= maxZahl) {
            System.out.print(zahl1 + " ");
            ergebnis = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = ergebnis;
        }
    }
}
