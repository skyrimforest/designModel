package org.skyrim.pattern.behavioral.command;

import java.util.Map;
import java.util.Set;

//具体的命令类
public class OrderCommand implements Command{
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单:");
        Map<String,Integer>foodDir=order.getFoodDir();
        Set<String> keys=foodDir.keySet();
        for(String foodName:keys){
            receiver.makeFood(foodName,foodDir.get(foodName));
        }
        System.out.println(order.getDiningTable()+"桌的饭准备完毕.");
    }

}
