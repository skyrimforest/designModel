package org.skyrim.pattern.creational.singleton.lanhan.demo03;


//    双重检查锁方式
public class Singleton {
    private Singleton(){}
    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHolder. INSTANCE;
    }

}
