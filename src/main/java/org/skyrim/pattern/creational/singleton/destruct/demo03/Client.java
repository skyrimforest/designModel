package org.skyrim.pattern.creational.singleton.destruct.demo03;

import java.io.*;

//序列化破坏单例模式
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writerObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:\\Project\\JavaPro\\newDesignModel\\src\\main\\java\\org\\skyrim\\pattern\\singleton\\destruct\\demo03\\a.txt"));
        Singleton singleton=(Singleton)ois.readObject();
        System.out.println(singleton);
        ois.close();
    }
    public static void writerObject2File() throws IOException {
        Singleton singleton= Singleton.getInstance();
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\Project\\JavaPro\\newDesignModel\\src\\main\\java\\org\\skyrim\\pattern\\singleton\\destruct\\demo03\\a.txt"));
        oos.writeObject(singleton);
        oos.close();
    }
}
