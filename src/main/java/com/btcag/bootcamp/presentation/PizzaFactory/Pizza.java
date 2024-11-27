package com.btcag.bootcamp.presentation.PizzaFactory;

public abstract class Pizza {
    protected String[] toppings = new String[5];

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
