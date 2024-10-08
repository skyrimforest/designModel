package org.skyrim.pattern.creational.factory.SimpleFactory;

//静态工厂
public class StaticCoffeeFactory {
    public static Coffee createCoffee(String type){
        Coffee coffee=null;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else{
            throw new RuntimeException("对不起,您点的咖啡没有呢");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
