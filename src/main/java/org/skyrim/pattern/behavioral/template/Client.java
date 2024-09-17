package org.skyrim.pattern.behavioral.template;

public class Client {
    public static void main(String[] args) {
//        炒包菜
//        创建对象
        AbstractClass baoCai=new ConcreteClassBaoCai();
        baoCai.cookProcess();
    }
}
