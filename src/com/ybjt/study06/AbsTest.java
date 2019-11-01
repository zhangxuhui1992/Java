package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-01 15:44
 */
public class AbsTest {
    public static void main(String[] args) {
        //抽象类的匿名子类
        Animal a = new Animal() {
            @Override
            void eat() {
                System.out.println("饭后");
            }

            @Override
            void walk() {
                System.out.println("百步走");
            }
        };
       a.eat();
       a.walk();
    }
}


abstract class Animal{
    abstract void eat();
    abstract void walk();
}