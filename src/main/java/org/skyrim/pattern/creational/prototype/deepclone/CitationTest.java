package org.skyrim.pattern.creational.prototype.deepclone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//深克隆 使用序列化
public class CitationTest {
    public static void main(String[] args) throws Exception {
//        创建原型对象
        Citation citation=new Citation();
        Student stu=new Student();
        stu.setName("张三");
        citation.setStu(stu);
//创建对象输出流对象
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(citation);
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        Citation citation1 = (Citation)ois.readObject();
        ois.close();
        Student stu1=citation1.getStu();
        stu1.setName("李四");

        citation.show();
        citation1.show();
    }
}
