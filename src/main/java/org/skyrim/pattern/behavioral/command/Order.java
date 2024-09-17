package org.skyrim.pattern.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
//    餐桌号码
    private int diningTable;
//    所下餐品及其份数
    private Map<String,Integer> foodDir=new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int num) {
        this.foodDir.put(name,num);
    }
}
