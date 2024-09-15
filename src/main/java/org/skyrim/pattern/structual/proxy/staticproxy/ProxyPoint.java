package org.skyrim.pattern.structual.proxy.staticproxy;

//代售点类
//实际上就是代理类
//对方法进行了增强
public class ProxyPoint implements SellTickets {
//    声明火车站类对象
    private TrainStation trainStation=new TrainStation();
    public void sell(){
        System.out.println("代售点收取服务费用");
        trainStation.sell();
    }
}
