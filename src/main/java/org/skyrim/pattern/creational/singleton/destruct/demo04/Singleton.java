package org.skyrim.pattern.creational.singleton.destruct.demo04;

public class Singleton {
    private static boolean flag = false;

    private Singleton() {
//        判断flag是否为true，若为，则非第一次访问，抛异常
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return singleton;
    }
}
