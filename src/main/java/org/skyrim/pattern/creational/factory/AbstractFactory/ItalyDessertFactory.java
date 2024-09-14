package org.skyrim.pattern.creational.factory.AbstractFactory;

public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDesert() {
        return new Tiramisu();
    }
}


