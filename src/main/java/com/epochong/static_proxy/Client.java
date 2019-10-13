package com.epochong.static_proxy;

/**
 * @author epochong
 * @date 2019/9/17 9:03
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new AskProxy());
        proxy.visit();
    }
}
