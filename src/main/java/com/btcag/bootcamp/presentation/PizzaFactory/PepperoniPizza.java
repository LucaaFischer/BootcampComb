package com.btcag.bootcamp.presentation.PizzaFactory;

import java.util.Arrays;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni Pizza");
        System.out.println("Adding toppings " + Arrays.toString(toppings()));
    }
    @Override
    public void bake() {
        System.out.println("Baking Pepperoni Pizza");
    }
    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni Pizza");
    }
    @Override
    public void box() {
        System.out.println("Boxing Pepperoni Pizza");
    }

    public String[] toppings() {
        this.toppings[0] = "Pepperoni";
        return this.toppings;
    }
}
