package org.skyrim.pattern.structual.proxy.jdkproxy;

import org.skyrim.pattern.structual.proxy.staticproxy.SellTickets;

//没有接口可以使用CDLIB实现代理
public class Client {
    public static void main(String[] args) {
//        获取代理对象
//        创建代理工厂对象
        ProxyFactory factory=new ProxyFactory();
//        使用工厂对象的方法获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
//        让程序一直执行
        while(true){

        }
    }
}
