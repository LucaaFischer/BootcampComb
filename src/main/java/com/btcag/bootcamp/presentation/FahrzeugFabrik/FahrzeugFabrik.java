package com.btcag.bootcamp.presentation.FahrzeugFabrik;

public class FahrzeugFabrik {
    public static Fahrzeug createFahrzeug(String fahrzeugTyp) {

        if (fahrzeugTyp.toLowerCase().equals("auto")) {
            return new Auto();
        } else if (fahrzeugTyp.toLowerCase().equals("motorrad")) {
            return new Motorrad();
        }
        return null;
    }
}
