package org.skyrim.pattern.creational.factory.FactoryMethod;

//此处就已经实现了解除耦合
//不再依赖于那两个类
public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
        CoffeeFactory factory = new AmericanCoffeeFactory();
        store.setFactory(factory);
        Coffee coffee=store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
