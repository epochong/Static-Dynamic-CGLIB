package com.epochong.static_proxy;

/**
 * @author epochong
 * @date 2019/9/15 20:55
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class AskProxy implements Subject {
    private String name = "epochong";

    @Override
    public void visit() {
        System.out.println(name);
    }
}
