package org.skyrim.pattern.structual.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
//        创建代售点类对象
        SellTickets proxyPoint=new ProxyPoint();
//        调用方法进行买票
        proxyPoint.sell();
    }
}
