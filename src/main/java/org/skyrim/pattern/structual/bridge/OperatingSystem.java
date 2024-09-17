package org.skyrim.pattern.structual.bridge;

//抽象的操作系统类
public abstract class OperatingSystem {
//    声明videofile变量
    protected VideoFile videoFile;
    public OperatingSystem(VideoFile videoFile){
        this.videoFile=videoFile;
    }
    public abstract void play(String fileName);
}
