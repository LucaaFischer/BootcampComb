package com.btcag.bootcamp.week2;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gib ein Jahr ein.");
        int year = input.nextInt();

        if(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " ist kein Schaltjahr");
        } else {
            System.out.println(year + " ist ein Schaltjahr");
        }
    }
}
