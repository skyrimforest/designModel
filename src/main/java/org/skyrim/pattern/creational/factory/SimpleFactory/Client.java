package org.skyrim.pattern.creational.factory.SimpleFactory;

//此处就已经实现了解除耦合
//不再依赖于那两个类
public class Client {
    public static void main(String[] args) {
        CoffeeStore store=new CoffeeStore();
        Coffee coffee=store.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
