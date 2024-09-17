package org.skyrim.pattern.behavioral.observer;

public interface Subject {
//    添加订阅者 添加观察者对象
    void attach(Observer observer);
    void detach(Observer observer);
//    同志订阅者更新消息
    void notify(String message);

}
