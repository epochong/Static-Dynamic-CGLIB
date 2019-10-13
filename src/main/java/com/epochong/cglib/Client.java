package com.epochong.cglib;

/**
 * @author epochong
 * @date 2019/10/12 23:37
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Client {
    public static void main(String[] args) {
        Book book = new Book();
        CglibProxy cglib = new CglibProxy();
        Book bookProxy = (Book)cglib.getInstance(book);
        bookProxy.addBook();
        bookProxy.delBook();
    }
}
