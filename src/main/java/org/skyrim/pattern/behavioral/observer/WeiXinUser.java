package org.skyrim.pattern.behavioral.observer;

//具体的观察者角色类
public class WeiXinUser implements Observer{
    private String name;
    @Override
    public void update(String message) {
        System.out.println(name+"-"+message);
    }

    public WeiXinUser(String name) {
        this.name = name;
    }
}
