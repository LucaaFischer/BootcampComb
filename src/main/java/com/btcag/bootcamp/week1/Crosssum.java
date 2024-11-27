package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class Crosssum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie eine Zahl ");

        long zahl = scanner.nextLong();
        long ergebnis = 0;

        String zahlString = zahl + "";

        int length = zahlString.length();

        while (length > 0) {
            String stellenwert = String.valueOf(zahlString.charAt(length - 1));
            ergebnis += Long.parseLong(stellenwert);

            length--;
        }

        System.out.println("Die Quersumme ist: " + ergebnis);
    }
}
