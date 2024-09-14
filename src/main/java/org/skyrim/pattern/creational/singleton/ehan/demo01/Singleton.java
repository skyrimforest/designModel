package org.skyrim.pattern.creational.singleton.ehan.demo01;

public class Singleton {
    private Singleton(){}
    private static Singleton singleton=new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}
