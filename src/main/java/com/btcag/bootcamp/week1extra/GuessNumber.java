package com.btcag.bootcamp.week1extra;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int i = 1;
        long guess = 0;

        System.out.println("Bitte gebe die Zahlengröße in Bits an: ");
        int inBit = input.nextInt();
        long bitShift = (long) 1 << inBit;
        long maxNumb = bitShift - 1;
        long randNumber = random.nextLong(0, maxNumb);

        while (guess != randNumber) {
            System.out.println(i + ". Versuch: Bitte eine Zahl im Bereich von 0 und " + maxNumb + " angeben: ");
            guess = input.nextLong();
            boolean loopbreaker = true;

            while (guess < randNumber && loopbreaker) {
                System.out.println("Die gesuchte Zahl ist größer!");
                loopbreaker = false;
            }

            while (guess > randNumber && loopbreaker) {
                System.out.println("Die gesuchte Zahl ist kleiner!");
                loopbreaker = false;
            }
            i++;
        }
        System.out.println("Super!");
    }
}
