package org.skyrim.pattern.structual.bridge;
//扩展抽象化方法
public class Mac extends OperatingSystem {
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
    videoFile.decode(fileName);
    }
}
