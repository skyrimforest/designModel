package org.skyrim.pattern.structual.adapter.objectadapter;

public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {
        String msg="TFCard read msg: hello world TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg:"+msg);
    }
}
