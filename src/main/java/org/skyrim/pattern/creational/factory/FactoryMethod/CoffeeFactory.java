package org.skyrim.pattern.creational.factory.FactoryMethod;


//工厂方法,完全遵循开闭原则
//抽象工厂->具体工厂,抽象产品->具体产品
//只需要知道名称就可以创建产品,不需要知道产品的具体创建过程
//每有一个产品就要增加具体的产品类和工厂类,复杂度增加.
public interface CoffeeFactory {
    Coffee createCoffee();
}
