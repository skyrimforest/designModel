package org.skyrim.pattern.creational.factory.AbstractFactory;


public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDesert() {
        return new MatchaMousse();
    }
}
