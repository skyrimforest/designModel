package org.skyrim.pattern.structual.adapter.classadapter;

//类适配器模式
//违背了合成复用原则
//需要客户类有一个接口规范才能使用,比如SDCard要是类的话就不行了
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
