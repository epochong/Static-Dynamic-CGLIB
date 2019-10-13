package com.epochong.static_proxy;

/**
 * @author epochong
 * @date 2019/9/15 20:53
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 代理类
 */
public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
