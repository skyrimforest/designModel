package org.skyrim.pattern.structual.bridge;

//具体的实现化角色
public class AviFile implements VideoFile{
    public void decode(String fileName){
        System.out.println("avi视频文件"+fileName);
    }
}
