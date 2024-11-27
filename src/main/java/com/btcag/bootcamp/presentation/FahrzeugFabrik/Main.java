package com.btcag.bootcamp.presentation.FahrzeugFabrik;

public class Main {
    public static void main(String[] args) {
        Fahrzeug auto = FahrzeugFabrik.createFahrzeug("auto");
        auto.fahren();

        Fahrzeug motorrad = FahrzeugFabrik.createFahrzeug("motorrad");
        motorrad.fahren();
    }
}
