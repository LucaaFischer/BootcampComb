package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class ASCIISquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gib eine Zahl > 0 ein");
        int size = input.nextInt();
        char star = 42;
        int i = 0;
        int j = 0;

        while (i < size) {
            i++;
            j = 0;
            System.out.println();
            while (j < size) {
                System.out.print(star);
                j++;
            }
        }
    }
}
