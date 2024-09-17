package org.skyrim.pattern.structual.flyweight;

public class Client {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox i = instance.getShape("I");
        i.display("灰色");
        AbstractBox l = instance.getShape("L");
        l.display("绿色");
        AbstractBox o = instance.getShape("O");
        o.display("蓝色");
        AbstractBox o2 = instance.getShape("O");
        o2.display("红色");
        System.out.println("两次O是否是一个: "+(o==o2));
    }
}
