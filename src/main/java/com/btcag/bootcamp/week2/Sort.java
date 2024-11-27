package com.btcag.bootcamp.week2;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gib eine Zahl ein");
            numbers[i] = input.nextInt();
        }

        for (int i = numbers.length; i >= 0; i--) {
            for (int j = 0; j < 9; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int currNumb = numbers[j];
                    int maxNumb = numbers[j + 1];
                    numbers[j] = maxNumb;
                    numbers[j + 1] = currNumb;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
