package org.skyrim.pattern.structual.combination;

import org.skyrim.pattern.structual.facade.Light;

import java.util.ArrayList;
import java.util.List;

//菜单类 树枝节点
public class Menu extends MenuComponent{
    private List<MenuComponent> menuComponentList=new ArrayList<>();
    public Menu(String name,int level){
        this.name=name;
        this.level=level;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }
    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
    @Override
    public void print() {
//      打印菜单名称
        System.out.println(name);
//      打印子菜单或者子菜单项名称
        for(MenuComponent component:menuComponentList){
            component.print();
        }
    }

}
