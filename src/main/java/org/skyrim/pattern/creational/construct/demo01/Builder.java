package org.skyrim.pattern.creational.construct.demo01;

//不建议加重builder的负担,否则不符合sop原则
public abstract class Builder {
//    声明bike类型的变量并赋值
    protected Bike bike=new Bike();
    public abstract void buildFrame();
    public abstract void buildSeat();

//    构建自行车的方法
    public abstract Bike createBike();
}
