package org.skyrim.pattern.creational.factory.FactoryMethod;


//咖啡店和咖啡耦合严重
//加新类非常麻烦
//需要解除咖啡店与咖啡的耦合
public class CoffeeStore {
    private CoffeeFactory factory;
    public void setFactory(CoffeeFactory factory){
        this.factory=factory;
    }
    public Coffee orderCoffee() {
        Coffee coffee=factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
