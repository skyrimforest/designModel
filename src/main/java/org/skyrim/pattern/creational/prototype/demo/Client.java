package org.skyrim.pattern.creational.prototype.demo;

public class Client {
    public static void main(String[] args) {
        RealizeType realizeType=new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println("原型对象与克隆出来的是否是同一个对象?"+(realizeType==clone));
    }
}
