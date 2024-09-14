package org.skyrim.pattern.creational.factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory=new ItalyDessertFactory();
//        AmericanDessertFactory factory=new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert desert = factory.createDesert();
        System.out.println(coffee.getName());
        desert.show();
    }
}
