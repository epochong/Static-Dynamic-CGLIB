package com.epochong.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author epochong
 * @date 2019/10/12 23:48
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */

public class CglibProxy implements MethodInterceptor {
    /**
     * 业务类对象，供代理方法中进行真正的业务方法调用
     */
    private Object target;

    /**
     * 相当于JDK动态代理中的绑定
     */
    public Object getInstance(Object target) {
        //给业务对象赋值
        this.target = target;
        //创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(this.target.getClass());
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦截
        enhancer.setCallback(this);
        // 创建动态代理类对象并返回
        return enhancer.create();
    }

    /**
     * 实现回调方法
     * @param obj 委托类对象
     * @param method 委托类中对应的方法
     * @param args 方法运行所需要的参数
     * @param proxy 代理对象
     * @return null
     * @throws Throwable 不存在该委托对象，会抛出异常
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代理类中：实现代理动作之前的预处理");
        //调用业务类（父类中）的方法
        proxy.invokeSuper(obj, args);
        System.out.println("代理类中：实现代理动作之后的处理");
        return null;
    }
}