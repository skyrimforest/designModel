package org.skyrim.pattern.creational.factory.SimpleFactory;

//简单工厂,专门提供一个类生产咖啡
//产生了新的耦合,工厂本身与商品对象进行了新的耦合
//后期加新品种会修改这个代码,违反了开闭原则
//因为工厂的客户端可能有很多,因此之后只需要修改工厂类的代码即可
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type){
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
