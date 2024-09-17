package org.skyrim.pattern.behavioral.observer;

import org.skyrim.pattern.behavioral.state.after.LiftState;

import java.util.ArrayList;
import java.util.List;

//具体角色主题类
public class SubScriptSubject implements Subject{
//    定义一个集合 用来存储多个观察者对象
    private List<Observer>weiXinUserList=new ArrayList<>();
    @Override
    public void attach(Observer observer) {
    weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
//        遍历集合
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
