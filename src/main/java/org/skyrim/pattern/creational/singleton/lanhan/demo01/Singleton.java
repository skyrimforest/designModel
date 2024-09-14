package org.skyrim.pattern.creational.singleton.lanhan.demo01;

//    太重量级了,读的时候不需要加锁
public class Singleton {
    private Singleton(){}
    private static Singleton instance;
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance =new Singleton();
        }
        return instance;
    }
}
