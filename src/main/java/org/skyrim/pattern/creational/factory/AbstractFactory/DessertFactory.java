package org.skyrim.pattern.creational.factory.AbstractFactory;

//想要加新产品只需要加一个产品类即可
//相互依赖的产品族
//多个产品族,但只需要某一族产品
//产品的类库,不依赖产品实例的创建细节和内部结构
public interface DessertFactory {
//    生产咖啡的功能
    Coffee createCoffee();
//    生产甜品的功能
    Dessert createDesert();
}
