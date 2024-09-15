package org.skyrim.pattern.structual.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("----------");
//        使用该计算机读取TF卡中的数据
//        定义适配器类
        String s1 = computer.readSD(new SDAdapterTF());
        System.out.println(s1);
    }
}
