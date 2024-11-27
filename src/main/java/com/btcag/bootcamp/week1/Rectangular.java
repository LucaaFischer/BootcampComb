package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die Länge des Rechtecks ein");
        double length = input.nextDouble();

        System.out.println("Geben Sie die Höhe des Rechtecks ein");
        double height = input.nextDouble();

        double flaeche = length * height;
        System.out.println("Flächeninhalt Rechteck: " + flaeche + "cm^2");
    }
}
