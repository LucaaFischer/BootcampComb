package com.btcag.bootcamp.presentation.PizzaFactory;

public class PizzaStore {
    public static Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        System.out.println("Your order of " + type + " Pizza is being processed");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected static Pizza createPizza(String type) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        return pizzaFactory.makePizza(type);
    }
}
