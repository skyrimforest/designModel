package org.skyrim.pattern.creational.singleton.destruct.demo03;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton(){}
    private static Singleton singleton=new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
//    进行反序列化时会自动调用该方法,将该方法的返回值直接返回
    public Object readResolve(){
        return Singleton.singleton;
    }
}
