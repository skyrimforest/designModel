package org.skyrim.pattern.creational.singleton.lanhan.demo02;


//    双重检查锁方式
public class Singleton {
    private Singleton(){}
    private static volatile Singleton instance;
    public static synchronized Singleton getInstance(){
//        第一次判断，若instance的值不为null，不需要抢占锁，直接返回对象
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
