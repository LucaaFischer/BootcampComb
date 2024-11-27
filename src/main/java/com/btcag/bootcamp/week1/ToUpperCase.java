package com.btcag.bootcamp.week1;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gib einen String ein, nur kleine Buchstaben.");
        String lowerCase = input.nextLine();

        String illegal = lowerCase.toUpperCase();
        System.out.println(illegal);
        String output = "";

        char conversion;
        int i = 0;
        int length = lowerCase.length();
        char currChar;
        int ascii = 0;

        while (i < length) {
            currChar = lowerCase.charAt(i);
            ascii = (int) currChar;
            while (ascii > 90) {
                ascii -= 32;
            }
            conversion = (char) ascii;
            output = output + conversion;
            i++;
        }
        System.out.println(output);
    }
}
