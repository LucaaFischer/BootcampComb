package com.btcag.bootcamp.presentation.PizzaFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What type of Pizza u wanna order?");
        String type = input.nextLine();

        Pizza pizza = PizzaStore.orderPizza(type);
    }
}
