package org.skyrim.pattern.structual.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        Computer computer=new Computer();
        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);
        System.out.println("----------");
//      使用该电脑读取TF卡中的数据
        String s1=computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(s1);
    }
}
