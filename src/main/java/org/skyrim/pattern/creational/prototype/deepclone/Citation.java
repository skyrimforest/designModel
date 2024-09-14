package org.skyrim.pattern.creational.prototype.deepclone;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {
//    private String name;
//
//    public String getName(){
//        return name;
//    }
//
//    public void setName(String name){
//        this.name=name;
//    }
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show(){
        System.out.println(stu.getName()+"同学表现优异!");
    }

    @Override
    public Citation clone() {
        try {
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
