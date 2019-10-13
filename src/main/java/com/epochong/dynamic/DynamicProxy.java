package com.epochong.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author epochong
 * @date 2019/9/18 20:04
 * @email epochong@163.com
 * @blog epochong.git   hub.io
 * @describe
 */
public class DynamicProxy implements InvocationHandler {
    /**
     * 委托类真实对象
     */
    private Object stu;

    public DynamicProxy(Object stu) {
        this.stu = stu;
    }

    /**
     * 复写的方法
     * @param proxy 我们所代理的委托类
     * @param method 调用委托类想执行的动作（方法）
     * @param args 调用委托类执行的动作时要接收的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("###########调用复写的invoke方法############");
        System.out.println("代理类可以执行一些自己的操作");
        System.out.println("动态代理类给委托类代理的动作（方法）名:" + method);
        /*
        执行委托类的方法
         */
        System.out.println("********下面是代理类为委托类执行的动作（执行method.invoke()）********");
        method.invoke(stu,args);
        System.out.println("*************************执行结束************************************");
        System.out.println("#######调用复写的invoke方法结束############");
        return stu;
    }
}
