package org.skyrim.pattern.creational.construct.demo02;

public class Client {
    public static void main(String[] args) {
        //    通过构建者类创建收集对象
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("金士顿")
                .mainboard("主板")
                .build();
        System.out.println(phone);
    }


}
