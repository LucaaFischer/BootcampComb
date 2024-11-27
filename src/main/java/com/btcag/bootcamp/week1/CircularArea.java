package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class CircularArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie den Radius des Kreises ein");
        double radius = input.nextDouble();

        double ergebnis = 3.14 * (radius * radius);

        System.out.println("Kreisfläche: " + ergebnis + "^2cm");

    }
}
