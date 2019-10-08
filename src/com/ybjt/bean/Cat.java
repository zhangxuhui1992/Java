package com.ybjt.bean;

/**
 * 单列设计模式 饿汉式
 * @author zxh
 * @create 2019-10-08 13:25
 */
public class Cat {
    private Cat(){}
    private static Cat catIns = new Cat();
    public static Cat getCatIns(){
        return catIns;
    }
}
