package com.epochong.dynamic;

/**
 * @author epochong
 * @date 2019/9/17 21:57
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class Student implements Person {

    @Override
    public void giveMoney(String name) {
        System.out.println(name + "交了钱");
    }

    @Override
    public void Money() {
        System.out.println("Student.Money()");
    }
}
