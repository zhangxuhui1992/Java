package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-01 15:18
 */
public class AbstractTest {
    public static void main(String[] args) {
        Man m = new Man();
        m.eat();
    }
}

//抽象类不能实例化，只能实例化子类
abstract class Person{
    //抽象方法只有方法的声明
    public abstract void eat();
}


class Man extends Person{
    public void eat(){
        System.out.println("我要吃好的！");
    }
}