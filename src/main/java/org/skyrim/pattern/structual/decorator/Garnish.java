package org.skyrim.pattern.structual.decorator;

//装饰者类
//抽象装饰者角色
//采用继承不利于扩展的时候用装饰者模式
//一类是系统中存在大量独立的扩展,子类数目爆炸增长
//二实因为类定义不能继承 如final修饰类
public abstract class Garnish extends FastFood {
//    声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood=fastFood;
    }

    public Garnish() {
    }
}
