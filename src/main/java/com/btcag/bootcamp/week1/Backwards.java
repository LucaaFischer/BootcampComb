package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String asString;
        long asLong;
        long reversed = 0;

        System.out.println("Bitte gib eine Zahl ein");
        asString = input.nextLine();

        System.out.println("Bitte gib die Zahl nochmal ein");
        asLong = input.nextLong();

        while (asLong > 0) {
            reversed = reversed * 10 + asLong % 10;
            asLong = asLong / 10;
        }

        System.out.println("Deine Zahl: " + (asString + 1));
        System.out.println("Deine Zahl: " + (asLong + 1));
        System.out.println(("Umgekehrte Zahl: " + reversed));


        // Bei der Eingabe von 01234 wird die Zahl umgekehrt ohne 0 ausgegeben. Das liegt daran, dass eine 0 am Anfang einer Zahl
        // nicht berücksichtigt wird und nicht zur Zahl "dazugehört".
        // als Long wird lediglich die 1 ausgegeben, weil
    }
}

