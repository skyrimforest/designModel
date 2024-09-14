package org.skyrim.pattern.creational.prototype.demo;

public class RealizeType implements Cloneable{
    public RealizeType(){
        System.out.println("具体原型创建完成");
    }

    @Override
    public RealizeType clone() {
        try {
            System.out.println("具体原型复制成功");
            return (RealizeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
