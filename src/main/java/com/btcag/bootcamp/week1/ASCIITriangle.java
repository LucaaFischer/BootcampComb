package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class ASCIITriangle {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        char star = 42;

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Gib eine Zahl > 0 ein");
        int dreieck = input.nextInt();
        while (i < dreieck) {
            i++;
            j = 0;
            System.out.println();
            while (j < i) {
                System.out.print(star);
                j++;
            }
        }
    }
}

