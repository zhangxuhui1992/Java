package com.ybjt.study05;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 单例设计模式 饿汉式
 * @author zxh
 * @create 2019-10-09 21:29
 */
public class Person {

    private Person(){};
    private static Person ins = new Person();
    public static Person getInstance(){
        return ins;
    }
}
