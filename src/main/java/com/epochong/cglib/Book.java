package com.epochong.cglib;

/**
 * @author epochong
 * @date 2019/10/12 23:48
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Book {
    public void addBook() {
        System.out.println("真实类方法：新增图书");
    }

    public void delBook() {
        System.out.println("委托类方法：减少图书");
    }
}