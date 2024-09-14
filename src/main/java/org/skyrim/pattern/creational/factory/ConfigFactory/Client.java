package org.skyrim.pattern.creational.factory.ConfigFactory;

public class Client {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
