package com.btcag.bootcamp.week1extra;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double euro = 0;
        long gegeben = 0;
        double change = 0;
        double eurogegeben = 0;
        double[] schein = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
        int i = 0; // für aktuellen Index im Array
        int j = 0; // Um Anzahl der Scheine zu zählen

        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden:");
        long produkte = input.nextInt();

        while (produkte != 0) {
            produkte = input.nextLong();
            sum += produkte;
        }

        euro = sum / 100;
        System.out.println("Die Summe aller Produkte beläuft sich auf " + euro + "Euro.");

        System.out.println("Wie viel hat der Kunde gegeben (Centbetrag)?");
        gegeben = input.nextLong();

        eurogegeben = (double) gegeben / 100;
        change = eurogegeben - euro;

        System.out.println("Bitte folgendes Geld zurückgeben: (" + change + " Euro)");

        while (i <= 14) {
            while (change >= schein[i]) {
                change = change - schein[i];
                j++;
            }
            System.out.println(j + " x " + schein[i] + " Euro");
            i++;
            j = 0;
        }
    }
}
