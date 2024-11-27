package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class ASCIIHourglass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char stern = 42;
        int i = 0;
        int j = 0;

        System.out.println("Gib eine Zahl > 0 ein");
        int dreieck = input.nextInt();

        while (i < dreieck) {
            i++;
            j = dreieck;
            System.out.println();
            while (j >= i) {
                System.out.print(stern);
                j--;
            }
        }
        System.out.println();
        i = 0;
        while (i < dreieck) {
            i++;
            j = 0;
            System.out.println();
            while (j < i) {
                System.out.print(stern);
                j++;
            }
        }
    }
}
