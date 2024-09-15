package org.skyrim.pattern.structual.adapter.objectadapter;

public class Computer {
//    SD卡中读取数据
    public String readSD(SDCard sdCard){
        if(sdCard==null){
            throw new NullPointerException("SD card can't be null");
        }
        return sdCard.readSD();
    }
}
