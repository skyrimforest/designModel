package org.skyrim.pattern.structual.proxy.jdkproxy;

import org.skyrim.pattern.structual.proxy.staticproxy.SellTickets;
import org.skyrim.pattern.structual.proxy.staticproxy.TrainStation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类也实现了对应的接口
public class ProxyFactory {
//    声明目标对象
    private TrainStation station=new TrainStation();
    public SellTickets getProxyObject(){
//        三个参数，1.类加载器，加载代理类，通过目标对象获取类加载器
//        2.代理类实现的接口的字节码对象
//        3.代理对象的调用处理程序
        SellTickets proxyInstance = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
//                调用了invoke方法进行操作
//                1.代理对象,和proxyObject对象是同一个对象,在invoke方法中基本不用
//                2.对接口中的方法进行封装的method对象
//                3.调用方法中的实际参数
//                返回值就是方法的返回值
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("invoke方法执行了");
                        System.out.println("代售点收取服务费用,jdk动态代理");
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyInstance;
    }
}
