package org.skyrim.pattern.creational.factory.SimpleFactory;


//咖啡店和咖啡耦合严重
//加新类非常麻烦
//需要解除咖啡店与咖啡的耦合
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = StaticCoffeeFactory.createCoffee(type);
        return coffee;
    }
}
