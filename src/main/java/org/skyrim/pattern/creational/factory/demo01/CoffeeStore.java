package org.skyrim.pattern.creational.factory.demo01;

//咖啡店和咖啡耦合严重
//加新类非常麻烦
//需要解除咖啡店与咖啡的耦合
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
//    声明coffee类型的变量,根据不同类型创建不同的coffee子类对象
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
