package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class DivCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;

        System.out.println("Welcher Divisor soll geprüft werden");
        int divisor = input.nextInt();

        System.out.println("Bis zu welcher Zahl?");
        int maxZahl = input.nextInt();

        while (i <= maxZahl) {
            while (i % divisor == 0) {
                System.out.println(i);
                i++;
            }
            i++;
        }
    }
}
