package org.skyrim.pattern.creational.singleton.destruct.demo01;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton(){}
    private static Singleton singleton=new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}
