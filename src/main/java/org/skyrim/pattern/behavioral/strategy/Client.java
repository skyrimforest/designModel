package org.skyrim.pattern.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        //    春节来了 使用村街促销活动
        SalesMan salesMan=new SalesMan(new StrategyA());
        salesMan.salesManShow();
        System.out.println("----------");
        SalesMan salesMan1=new SalesMan(new StrategyB());
        salesMan1.salesManShow();
    }


}
