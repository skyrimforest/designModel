package org.skyrim.pattern.creational.singleton.destruct.demo02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//序列化破坏单例模式
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Singleton.class;
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();
//        若为true说明未破坏单例模式;若未false,则破坏了单例模式
        System.out.println(s1 == s2);
    }
}
