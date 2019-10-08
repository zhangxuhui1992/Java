package com.ybjt.bean;

/**
 * 单例设计模式 懒汉式
 * @author zxh
 * @create 2019-10-08 13:29
 */
public class Dog {
    private Dog(){}
    private static Dog dogIns = null;
    public static synchronized Dog getDogIns(){
        if(dogIns != null){
            return new Dog();
        }
        return  dogIns;
    }
}
