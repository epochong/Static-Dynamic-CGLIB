package com.epochong.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author epochong
 * @date 2019/9/18 21:16
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Client {
    public static void main(String[] args) {
        //委托类对象
        Person realStudent = new Student();
        InvocationHandler handler = new DynamicProxy(realStudent);
        /**
         * 通过内置类Proxy的 newProxyInstance 方法创建代理类，该方法有三个参数
         * ClassLoader loader: 代理类的类加载器，以方便加载代理对象
         * Class<?>[] interfaces: 委托类所实现的所有接口，表示代理实现接口的委托类对象，这样就能调用具体委托类所执行的操作
         * InvocationHandler h: 将委托类和动态代理类关联起来，传入动态代理的类
         */
        Person proxy = (Person) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),realStudent.getClass().getInterfaces(),handler);
        System.out.println("------------------------------------Client--------------------------------------");
        System.out.println("动态代理类的名称（Java自带动态代理类Proxy）：" + proxy.getClass().getName());
        proxy.giveMoney("epochong");
        proxy.Money();
        System.out.println("---------------------------------------------------------------------------------");
    }
}
