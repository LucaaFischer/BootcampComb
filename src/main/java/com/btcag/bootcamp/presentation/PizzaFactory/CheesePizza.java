package com.btcag.bootcamp.presentation.PizzaFactory;

import java.util.Arrays;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese pizza");
        System.out.println("Adding toppings " + Arrays.toString(toppings()));
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza");
    }

    public String[] toppings() {
        this.toppings[0] = "Cheese";
        return this.toppings;
    }
}
