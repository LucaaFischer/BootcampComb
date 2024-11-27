package com.btcag.bootcamp.presentation.PizzaFactory;

import com.btcag.bootcamp.Main;

public class PizzaFactory {
    public Pizza makePizza(String pizzaType) {
        if (pizzaType.toLowerCase().equals("cheese")) {
            return new CheesePizza();
        } else if (pizzaType.toLowerCase().equals("pepperoni")) {
            return new PepperoniPizza();
        } else {
            System.out.println("Invalid pizza type");
            Main.main(new String[0]);
            return null;
        }
    }
}
