package org.skyrim.pattern.behavioral.observer;

public class Client {
    public static void main(String[] args) {
//        创建公众号对象
        SubScriptSubject subject=new SubScriptSubject();
//        订阅公众号
        subject.attach(new WeiXinUser("孙悟空"));
        subject.attach(new WeiXinUser("猪悟能"));
        subject.attach(new WeiXinUser("沙悟净"));
//        公众号更新 发出消息给观察者
        subject.notify("原神启动了！");

    }
}
