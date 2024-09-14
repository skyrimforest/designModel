package org.skyrim.pattern.creational.factory.FactoryMethod;

//专门用于生成美式咖啡
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
