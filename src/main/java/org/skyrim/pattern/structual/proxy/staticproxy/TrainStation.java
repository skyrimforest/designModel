package org.skyrim.pattern.structual.proxy.staticproxy;

//具体主题类
public class TrainStation implements SellTickets{
    public void sell(){
        System.out.println("火车站卖票");
    }
}
