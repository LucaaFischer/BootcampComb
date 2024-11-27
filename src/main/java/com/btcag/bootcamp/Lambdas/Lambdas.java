package com.btcag.bootcamp.Lambdas;

public class Lambdas implements ILebewesen{
    public static void main(String[] args) {
        Lebewesen elephant = (String v, String n) -> System.out.println(v + "Töröö " + n);
        Lebewesen cat = (String v, String n) -> System.out.println(v + "Meow " + n);
        Lebewesen dog = (String v, String n) -> System.out.println(v + "Woof " + n);

        callMethod(elephant);
        callMethod(cat);
        callMethod(dog);

    }
    public static void callMethod(Lebewesen lebewesen) {
        lebewesen.doSomething("Animal: ", "lol");
    }
}
