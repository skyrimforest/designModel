package org.skyrim.pattern.structual.combination;

//菜单项 属于叶子节点
public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level){
        this.name=name;
        this.level=level;
    }
    @Override
    public void print() {
//        打印菜单项名称
        System.out.println(name);
    }
}
