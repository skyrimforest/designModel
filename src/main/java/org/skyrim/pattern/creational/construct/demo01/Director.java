package org.skyrim.pattern.creational.construct.demo01;

public class Director {
//    声明builder类型的变量
    private final Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
