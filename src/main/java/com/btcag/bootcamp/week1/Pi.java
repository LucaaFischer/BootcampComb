package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 3;
        double pi = 1;
        double ergebnis = 1;

        System.out.println("Wie viele Durchläufe sollen erfolgen?");
        int maxRuns = input.nextInt();
        int runs = 0;

        while (runs <= maxRuns) {
            if (runs % 2 == 0) {
                ergebnis -= ((double) 1 / i);
            } else {
                ergebnis += ((double) 1 / i);
            }
            runs++;
            i = i + 2;
        }

        pi = 4 * ergebnis;
        System.out.println("Nach " + runs + " Durchläufen wurde Pi auf den Wert " + pi + " berechnet.");
    }
}
